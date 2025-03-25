package com.learn.ticketbookingsystem.domain.services.impl;

import com.learn.ticketbookingsystem.data.respositories.TicketRepository;
import com.learn.ticketbookingsystem.domain.entities.Ticket;
import com.learn.ticketbookingsystem.domain.services.TicketService;
import com.learn.ticketbookingsystem.domain.services.base.DomainServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl extends DomainServiceImpl<Ticket> implements TicketService {

    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }

}
