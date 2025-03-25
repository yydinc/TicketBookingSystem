package com.learn.ticketbookingsystem.presentation.controllers;

import com.learn.ticketbookingsystem.domain.entities.Plane;
import com.learn.ticketbookingsystem.domain.services.PlaneService;
import com.learn.ticketbookingsystem.presentation.controllers.base.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planes")
public class PlaneController extends CrudController<Plane> {

    public PlaneController(PlaneService planeService) {
        super(planeService);
    }
}
