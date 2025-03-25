package com.learn.ticketbookingsystem.presentation.controllers;

import com.learn.ticketbookingsystem.domain.entities.Flight;
import com.learn.ticketbookingsystem.domain.services.FlightService;
import com.learn.ticketbookingsystem.presentation.controllers.base.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightController extends CrudController<Flight> {

    public FlightController(FlightService flightService) {
        super(flightService);
    }

}
