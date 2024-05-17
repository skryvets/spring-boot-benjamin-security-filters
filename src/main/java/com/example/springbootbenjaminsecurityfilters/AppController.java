package com.example.springbootbenjaminsecurityfilters;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/c")
    public Map<String, String> cEndpoint() {
        return Map.of("status", "ok");
    }

    @GetMapping("/api")
    public Map<String, String> apiEndpoint() {
        return Map.of("status", "ok");
    }
}
