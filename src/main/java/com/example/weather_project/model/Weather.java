package com.example.weather_project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weather {
    private final String city;
    public double temperature;
    public double humidity;

    public Weather(String city, double temperature, double humidity) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }

}
