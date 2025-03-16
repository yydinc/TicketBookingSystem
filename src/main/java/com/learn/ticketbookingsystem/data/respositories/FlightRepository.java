package com.learn.ticketbookingsystem.data.respositories;

import com.learn.ticketbookingsystem.domain.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
