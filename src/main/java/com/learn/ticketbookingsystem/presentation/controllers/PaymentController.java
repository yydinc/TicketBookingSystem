package com.learn.ticketbookingsystem.presentation.controllers;

import com.learn.ticketbookingsystem.domain.entities.Payment;
import com.learn.ticketbookingsystem.domain.services.PaymentService;
import com.learn.ticketbookingsystem.presentation.controllers.base.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController extends CrudController<Payment> {

    public PaymentController(PaymentService paymentService) {
        super(paymentService);
    }
}
