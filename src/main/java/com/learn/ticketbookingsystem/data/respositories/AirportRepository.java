package com.learn.ticketbookingsystem.data.respositories;

import com.learn.ticketbookingsystem.domain.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
}
