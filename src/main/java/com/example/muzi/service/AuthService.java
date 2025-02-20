package com.example.muzi.service;

import com.example.muzi.entity.User;
import com.example.muzi.repository.UserRepository;
import com.example.muzi.config.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // ✅ Ensure password encoding is used

    @Autowired
    private JwtUtil jwtUtil;

    public String registerUser(User user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            return "Error: Username already exists!";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword())); // ✅ Hash password before saving
        userRepository.save(user);
        return "User registered successfully!";
    }

    public String authenticateUser(String username, String password) {
        Optional<User> userOpt = userRepository.findByUsername(username);

        if (userOpt.isPresent()) {
            User user = userOpt.get();
            if (passwordEncoder.matches(password, user.getPassword())) { // ✅ Compare hashed passwords
                return jwtUtil.generateToken(username);
            } else {
                return "Error: Invalid username or password!";
            }
        }
        return "Error: Invalid username or password!";
    }
}
