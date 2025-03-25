package com.learn.ticketbookingsystem.domain.services.impl;

import com.learn.ticketbookingsystem.data.respositories.UserRepository;
import com.learn.ticketbookingsystem.domain.entities.User;
import com.learn.ticketbookingsystem.domain.services.UserService;
import com.learn.ticketbookingsystem.domain.services.base.DomainServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends DomainServiceImpl<User> implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

}
