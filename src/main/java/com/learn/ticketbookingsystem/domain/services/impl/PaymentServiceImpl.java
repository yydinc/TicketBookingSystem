package com.learn.ticketbookingsystem.domain.services.impl;

import com.learn.ticketbookingsystem.data.respositories.PaymentRepository;
import com.learn.ticketbookingsystem.domain.entities.Payment;
import com.learn.ticketbookingsystem.domain.services.PaymentService;
import com.learn.ticketbookingsystem.domain.services.base.DomainServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends DomainServiceImpl<Payment> implements PaymentService {

    public PaymentServiceImpl(PaymentRepository repository) {
        super(repository);
    }

}
