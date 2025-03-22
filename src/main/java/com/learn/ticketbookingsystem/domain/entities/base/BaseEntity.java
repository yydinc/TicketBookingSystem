package com.learn.ticketbookingsystem.domain.entities.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate = new Date();

}
