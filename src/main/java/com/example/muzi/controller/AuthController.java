package com.example.muzi.controller;

import com.example.muzi.entity.User;
import com.example.muzi.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return authService.registerUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User loginRequest) { // ✅ Use @RequestBody instead of @RequestParam
        return authService.authenticateUser(loginRequest.getUsername(), loginRequest.getPassword());
    }
}
