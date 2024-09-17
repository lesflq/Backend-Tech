package uk.sevastianov.backtech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheckController {
    @GetMapping(value = "/healthcheck", produces = "application/json")
    public Map<String, Object> healthCheck() {
        Map<String, Object> response = new HashMap<>();

        // Add a date and status of the server
        response.put("Date", LocalTime.now());
        response.put("status", "OK");
        return response;
    }
}
