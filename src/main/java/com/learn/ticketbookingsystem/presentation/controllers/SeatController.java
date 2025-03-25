package com.learn.ticketbookingsystem.presentation.controllers;

import com.learn.ticketbookingsystem.domain.entities.Seat;
import com.learn.ticketbookingsystem.domain.services.SeatService;
import com.learn.ticketbookingsystem.presentation.controllers.base.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class SeatController extends CrudController<Seat> {

    public SeatController(SeatService seatService) {
        super(seatService);
    }
}
