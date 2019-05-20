package br.edu.fatecjahu.classroom.infra.persistence.repository;

import br.edu.fatecjahu.classroom.domain.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    boolean existsBookingByBookingDateAndClassroomIdAndPeriodId(LocalDate bookingDate, Long classroomId, Long periodId);

    boolean existsBookingByIdNotAndBookingDateAndClassroomIdAndPeriodId(Long id, LocalDate bookingDate, Long classroomId, Long periodId);
}
