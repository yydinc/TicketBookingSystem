package com.learn.ticketbookingsystem.domain.entities;


import com.learn.ticketbookingsystem.domain.entities.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "planes")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Plane extends BaseEntity {

    @Column(nullable = false)
    private String planeModel;

    @OneToMany(mappedBy = "plane")
    private List<Seat> seats;
}
