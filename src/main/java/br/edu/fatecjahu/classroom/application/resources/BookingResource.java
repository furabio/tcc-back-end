package br.edu.fatecjahu.classroom.application.resources;

import br.edu.fatecjahu.classroom.domain.model.Booking;
import br.edu.fatecjahu.classroom.domain.service.BookingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/bookings")
public class BookingResource extends AbstractResource<Booking, BookingService>{
}
