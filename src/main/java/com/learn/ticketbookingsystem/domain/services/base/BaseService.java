package com.learn.ticketbookingsystem.domain.services.base;

import java.util.List;

public interface BaseService<T> {

    T create(T t);
    void delete(long id);
    void update(long id, T entity);
    T getById(long id);
    List<T> getAll();
}
