package com.learn.ticketbookingsystem.domain.entities;

import com.learn.ticketbookingsystem.domain.entities.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "flights")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Flight extends BaseEntity {

    @Column(nullable = false, length = 100)
    private String airline;

    @Column(nullable = false, unique = true, length = 20)
    private String flightNumber;

    //plane

    @ManyToOne
    @JoinColumn(name = "departure_airport_id", nullable = false)
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", nullable = false)
    private Airport arrivalAirport;

    @Column(nullable = false)
    private Date departureTime;

    @Column(nullable = false)
    private Date arrivalTime;

    @Column(nullable = false)
    private double basePricePerTicket;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FlightStatus status = FlightStatus.SCHEDULED;

    public enum FlightStatus {
        SCHEDULED, DELAYED, CANCELED, COMPLETED
    }
}
