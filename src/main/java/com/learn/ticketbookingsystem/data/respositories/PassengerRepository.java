package com.learn.ticketbookingsystem.data.respositories;

import com.learn.ticketbookingsystem.data.respositories.base.BaseRepository;
import com.learn.ticketbookingsystem.domain.entities.Passenger;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends BaseRepository<Passenger> {
}
