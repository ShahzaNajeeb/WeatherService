package com.example.weather_project.service;

import com.example.weather_project.model.Weather;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WeatherService {
    private Map<String, Weather> weatherData = new HashMap<>();

    public WeatherService() {
        weatherData.put("London", new Weather("London", 15.5, 70));
        weatherData.put("New York", new Weather("New York", 22.1, 60));
    }

    public Weather getWeather(String city) {
        return weatherData.getOrDefault(city, new Weather(city, 25.0, 50));
    }
}
