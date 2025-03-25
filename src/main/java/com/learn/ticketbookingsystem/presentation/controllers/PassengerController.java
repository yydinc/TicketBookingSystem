package com.learn.ticketbookingsystem.presentation.controllers;

import com.learn.ticketbookingsystem.domain.entities.Passenger;
import com.learn.ticketbookingsystem.domain.services.PassengerService;
import com.learn.ticketbookingsystem.presentation.controllers.base.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passengers")
public class PassengerController extends CrudController<Passenger> {

    public PassengerController(PassengerService passengerService) {
        super(passengerService);
    }
}
