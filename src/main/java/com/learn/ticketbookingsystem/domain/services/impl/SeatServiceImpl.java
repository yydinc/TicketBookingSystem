package com.learn.ticketbookingsystem.domain.services.impl;

import com.learn.ticketbookingsystem.data.respositories.SeatRepository;
import com.learn.ticketbookingsystem.domain.entities.Seat;
import com.learn.ticketbookingsystem.domain.services.SeatService;
import com.learn.ticketbookingsystem.domain.services.base.DomainServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SeatServiceImpl extends DomainServiceImpl<Seat> implements SeatService {

    public SeatServiceImpl(SeatRepository repository) {
        super(repository);
    }

}
