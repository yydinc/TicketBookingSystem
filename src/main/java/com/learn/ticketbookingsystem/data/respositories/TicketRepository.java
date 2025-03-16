package com.learn.ticketbookingsystem.data.respositories;

import com.learn.ticketbookingsystem.domain.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
