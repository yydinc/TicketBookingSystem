package com.learn.ticketbookingsystem.domain.entities;

import com.learn.ticketbookingsystem.domain.entities.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "bookings")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingEndDate;

    @Column(nullable = false)
    private double totalPrice;
}