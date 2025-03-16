package com.learn.ticketbookingsystem.data.respositories;

import com.learn.ticketbookingsystem.domain.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
