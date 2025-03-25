package com.learn.ticketbookingsystem.presentation.controllers;

import com.learn.ticketbookingsystem.domain.entities.Ticket;
import com.learn.ticketbookingsystem.domain.services.base.DomainService;
import com.learn.ticketbookingsystem.presentation.controllers.base.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
public class TicketController extends CrudController<Ticket> {

    public TicketController(DomainService<Ticket> ticketService) {
        super(ticketService);
    }
}
