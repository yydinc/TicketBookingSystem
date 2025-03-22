package com.learn.ticketbookingsystem.data.respositories;

import com.learn.ticketbookingsystem.data.respositories.base.BaseRepository;
import com.learn.ticketbookingsystem.domain.entities.Flight;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightRepository extends BaseRepository<Flight> {
}
