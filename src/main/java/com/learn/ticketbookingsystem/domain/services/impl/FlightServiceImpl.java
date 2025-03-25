package com.learn.ticketbookingsystem.domain.services.impl;

import com.learn.ticketbookingsystem.data.respositories.FlightRepository;
import com.learn.ticketbookingsystem.domain.entities.Flight;
import com.learn.ticketbookingsystem.domain.services.FlightService;
import com.learn.ticketbookingsystem.domain.services.base.DomainServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl extends DomainServiceImpl<Flight> implements FlightService {

    public FlightServiceImpl(FlightRepository repository) {
        super(repository);
    }

}
