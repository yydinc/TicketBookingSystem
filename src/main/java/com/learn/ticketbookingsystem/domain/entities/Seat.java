package com.learn.ticketbookingsystem.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "seats")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @Column(nullable = false, length = 10)
    private String seatNumber;

    @Column(nullable = false)
    private boolean isBooked = false;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SeatClass seatClass = SeatClass.ECONOMY;

    public enum SeatClass {
        ECONOMY, BUSINESS, FIRST_CLASS
    }
}