package com.ram.imgur.controller;

import com.ram.imgur.entity.User;
import com.ram.imgur.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        User registeredUser = service.registerUser(user);
        return ResponseEntity.ok(registeredUser.getUsername() + " registered successfully");
    }
}
