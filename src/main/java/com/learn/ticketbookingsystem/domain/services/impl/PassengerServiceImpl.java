package com.learn.ticketbookingsystem.domain.services.impl;

import com.learn.ticketbookingsystem.data.respositories.PassengerRepository;
import com.learn.ticketbookingsystem.domain.entities.Passenger;
import com.learn.ticketbookingsystem.domain.services.PassengerService;
import com.learn.ticketbookingsystem.domain.services.base.DomainServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl extends DomainServiceImpl<Passenger> implements PassengerService {

    public PassengerServiceImpl(PassengerRepository repository) {
        super(repository);
    }

}
