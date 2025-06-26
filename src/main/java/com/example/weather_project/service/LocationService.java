package com.example.weather_project.service;

import com.example.weather_project.model.Location;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LocationService {
    private Map<String, Location> locationData = new HashMap<>();

    public LocationService() {
        // mock data
        locationData.put("London", new Location("London", "UK"));
        locationData.put("New York", new Location("New York", "USA"));
    }

    public Location getLocation(String city) {
        return locationData.getOrDefault(city, new Location(city, "Unknown"));
    }
}

