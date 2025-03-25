package com.learn.ticketbookingsystem.domain.services.impl;

import com.learn.ticketbookingsystem.data.respositories.AirportRepository;
import com.learn.ticketbookingsystem.domain.entities.Airport;
import com.learn.ticketbookingsystem.domain.services.AirportService;
import com.learn.ticketbookingsystem.domain.services.base.DomainServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AirportServiceImpl extends DomainServiceImpl<Airport> implements AirportService {

    public AirportServiceImpl(AirportRepository repository) {
        super(repository);
    }

}
