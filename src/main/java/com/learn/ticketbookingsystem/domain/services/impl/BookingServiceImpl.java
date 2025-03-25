package com.learn.ticketbookingsystem.domain.services.impl;

import com.learn.ticketbookingsystem.data.respositories.BookingRepository;
import com.learn.ticketbookingsystem.domain.entities.Booking;
import com.learn.ticketbookingsystem.domain.services.BookingService;
import com.learn.ticketbookingsystem.domain.services.base.DomainServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl extends DomainServiceImpl<Booking> implements BookingService {
    
    public BookingServiceImpl(BookingRepository repository) {
        super(repository);
    }
    
}
