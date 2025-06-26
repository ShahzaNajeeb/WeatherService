package com.example.weather_project.controller;

import com.example.weather_project.model.Weather;
import com.example.weather_project.model.Location;
import com.example.weather_project.service.LocationService;
import com.example.weather_project.service.NotificationService;
import com.example.weather_project.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WeatherController {

    private final WeatherService weatherService;
    private final LocationService locationService;
    private NotificationService notificationService;

    // constructor injection
    public WeatherController(WeatherService weatherService, LocationService locationService) {
        this.weatherService = weatherService;
        this.locationService = locationService;
    }

    // setter injection for prototype scoped bean
    @Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/weather/{city}")
    public Weather getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    }

    @GetMapping("/location/{city}")
    public Location getLocation(@PathVariable String city) {
        return locationService.getLocation(city);
    }

    @PostMapping("/alerts")
    public String sendAlert(@RequestParam String message) {
        return notificationService.sendAlert(message);
    }
}

