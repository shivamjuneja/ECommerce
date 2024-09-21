package com.ex.ecommerce.controller;


import com.ex.ecommerce.dao.UserRepository;
import com.ex.ecommerce.dtos.UserDTO;
import com.ex.ecommerce.entity.User;
import com.ex.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userServicee;

    @GetMapping("/users")
    public List<UserDTO> getAllUser(){
        return userServicee.getAllUsers();
    }

    @PostMapping("/save")
    public UserDTO createUser(@RequestBody UserDTO userDTO){

        return userServicee.saveUser(userDTO);
    }

}
