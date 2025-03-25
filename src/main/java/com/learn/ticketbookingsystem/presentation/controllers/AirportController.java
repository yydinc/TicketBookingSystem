package com.learn.ticketbookingsystem.presentation.controllers;

import com.learn.ticketbookingsystem.domain.entities.Airport;
import com.learn.ticketbookingsystem.domain.services.AirportService;
import com.learn.ticketbookingsystem.presentation.controllers.base.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airports")
public class AirportController extends CrudController<Airport> {

    public AirportController(AirportService airportService) {
        super(airportService);
    }


}
