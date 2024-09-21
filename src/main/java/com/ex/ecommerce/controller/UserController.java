package com.ex.ecommerce.controller;


import com.ex.ecommerce.dao.UserRepository;
import com.ex.ecommerce.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/user")
    public User getUser(){
        return new User("1","shivamjuneja22081998@gmail.com","shivam","juneja","Shivam");
    }

    @PostMapping("/save")
    public User createUser(@RequestBody User user){
        return repository.save(user);
    }

}
