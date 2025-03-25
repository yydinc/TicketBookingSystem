package com.learn.ticketbookingsystem.presentation.controllers;

import com.learn.ticketbookingsystem.domain.entities.Booking;
import com.learn.ticketbookingsystem.domain.services.BookingService;
import com.learn.ticketbookingsystem.presentation.controllers.base.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController extends CrudController<Booking> {

    public BookingController(BookingService bookingService) {
        super(bookingService);
    }

}
