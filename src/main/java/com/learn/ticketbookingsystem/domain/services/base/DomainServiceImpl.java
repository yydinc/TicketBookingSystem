package com.learn.ticketbookingsystem.domain.services.base;

import com.learn.ticketbookingsystem.data.respositories.base.BaseRepository;
import com.learn.ticketbookingsystem.domain.entities.base.BaseEntity;

import java.util.List;

public class DomainServiceImpl<T extends BaseEntity> implements DomainService<T> {

    protected final BaseRepository<T> repository;

    public DomainServiceImpl(BaseRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    public T getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, T entity) {
        T foundEntity = getById(id);
        entity.setId(id);
        foundEntity = entity;
    }
}
