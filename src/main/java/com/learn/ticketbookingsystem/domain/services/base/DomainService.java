package com.learn.ticketbookingsystem.domain.services.base;

import com.learn.ticketbookingsystem.domain.entities.base.BaseEntity;

import java.util.List;

public interface DomainService<T extends BaseEntity> {

    T create(T t);
    void delete(Long id);
    void update(Long id, T entity);
    T getById(Long id);
    List<T> getAll();

}
