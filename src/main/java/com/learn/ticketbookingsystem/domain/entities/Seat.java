package com.learn.ticketbookingsystem.domain.entities;

import com.learn.ticketbookingsystem.domain.entities.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "seats")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Seat extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "plane_id", nullable = false)
    private Plane plane;

    @Column(nullable = false, length = 10)
    private String seatNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SeatClass seatClass = SeatClass.ECONOMY;

    public enum SeatClass {
        ECONOMY, BUSINESS, FIRST_CLASS
    }
}