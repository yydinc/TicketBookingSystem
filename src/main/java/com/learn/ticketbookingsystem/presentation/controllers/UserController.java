package com.learn.ticketbookingsystem.presentation.controllers;

import com.learn.ticketbookingsystem.domain.entities.User;
import com.learn.ticketbookingsystem.domain.services.base.DomainService;
import com.learn.ticketbookingsystem.presentation.controllers.base.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends CrudController<User> {

    public UserController(DomainService<User> userService) {
        super(userService);
    }
}
