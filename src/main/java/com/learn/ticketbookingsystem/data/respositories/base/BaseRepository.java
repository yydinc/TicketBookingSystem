package com.learn.ticketbookingsystem.data.respositories.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository <T> extends JpaRepository<T, Long> {
}
