package com.example.customspringsecurity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/profile")
    public String getProfile() {
        return "User Profile Data";
    }
}
