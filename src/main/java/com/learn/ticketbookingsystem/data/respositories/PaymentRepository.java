package com.learn.ticketbookingsystem.data.respositories;

import com.learn.ticketbookingsystem.data.respositories.base.BaseRepository;
import com.learn.ticketbookingsystem.domain.entities.Payment;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends BaseRepository<Payment> {
}
