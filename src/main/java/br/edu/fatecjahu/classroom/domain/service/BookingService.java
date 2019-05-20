package br.edu.fatecjahu.classroom.domain.service;

import br.edu.fatecjahu.classroom.application.exceptions.ClassroomException;
import br.edu.fatecjahu.classroom.domain.model.Booking;
import br.edu.fatecjahu.classroom.infra.persistence.repository.BookingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookingService extends AbstractService<Booking, BookingRepository> {

    private final UserService userService;
    private final ClassroomService classroomService;
    private final PeriodService periodService;

    public BookingService(UserService userService, ClassroomService classroomService, PeriodService periodService) {
        this.userService = userService;
        this.classroomService = classroomService;
        this.periodService = periodService;
    }

    @Override
    public Booking create(Booking booking) {
        validBooking(booking);
        validExistsBookingByBookingDateAndClassroomIdAndPeriodId(booking.getBookingDate(), booking.getClassroom().getId(), booking.getPeriod().getId());
        return super.create(booking);
    }

    @Override
    public Booking update(Booking booking) {
        if (getRepository().existsBookingByIdNotAndBookingDateAndClassroomIdAndPeriodId(booking.getId(), booking.getBookingDate(), booking.getClassroom().getId(), booking.getPeriod().getId())) {
            throw new ClassroomException("Reserva já existente!", HttpStatus.PRECONDITION_FAILED);
        }
        return super.update(booking);
    }

    private void validBooking(Booking booking) {
        userService.findById(booking.getUser().getId());
        classroomService.findById(booking.getClassroom().getId());
        periodService.findById(booking.getPeriod().getId());
    }

    private void validExistsBookingByBookingDateAndClassroomIdAndPeriodId(LocalDate bookingDate, Long classroomId, Long periodId){
        if (getRepository().existsBookingByBookingDateAndClassroomIdAndPeriodId(bookingDate, classroomId, periodId)) {
            throw new ClassroomException("Reserva já existente!", HttpStatus.PRECONDITION_FAILED);
        }
    }

}
