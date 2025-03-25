package com.learn.ticketbookingsystem.domain.services.impl;

import com.learn.ticketbookingsystem.data.respositories.PlaneRepository;
import com.learn.ticketbookingsystem.domain.entities.Plane;
import com.learn.ticketbookingsystem.domain.services.PlaneService;
import com.learn.ticketbookingsystem.domain.services.base.DomainServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PlaneServiceImpl extends DomainServiceImpl<Plane> implements PlaneService {

    public PlaneServiceImpl(PlaneRepository repository) {
        super(repository);
    }

}
