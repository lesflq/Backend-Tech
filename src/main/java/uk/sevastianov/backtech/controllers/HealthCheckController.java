package uk.sevastianov.backtech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheckController {
    @GetMapping(value = "/healthcheck", produces = "application/json")
    public Map<String, Object> healthCheck() {
        Map<String, Object> response = new HashMap<>();
        // Making localdatetime for our json
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String formattedDateTime = now.format(formatter);

        response.put("Date", formattedDateTime);
        response.put("status", "OK");
        return response;
    }
}
