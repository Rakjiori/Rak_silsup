package com.example.silsup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RakTest {
    @GetMapping("/api/ping")
    public String ping() {
        return "bongrak";
    }
}
