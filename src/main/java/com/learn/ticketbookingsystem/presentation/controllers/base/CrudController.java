package com.learn.ticketbookingsystem.presentation.controllers.base;

import com.learn.ticketbookingsystem.domain.entities.base.BaseEntity;
import com.learn.ticketbookingsystem.domain.services.base.DomainService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CrudController<T extends BaseEntity> {

    protected final DomainService<T> domainService;

    protected CrudController(DomainService<T> repository) {
        this.domainService = repository;
    }

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        List<T> entities = domainService.getAll();
        return new ResponseEntity<>(entities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable long id) {
        T entity = domainService.getById(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        T savedEntity = domainService.create(entity);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable long id, @RequestBody T updatedEntity) {
        domainService.update(id, updatedEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        domainService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

