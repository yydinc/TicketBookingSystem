package com.learn.ticketbookingsystem.data.respositories;

import com.learn.ticketbookingsystem.data.respositories.base.BaseRepository;
import com.learn.ticketbookingsystem.domain.entities.Airport;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends BaseRepository<Airport> {
}
