package com.example.weather_project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private String city;
    private String country;

    public Location(String city, String country) {
        this.city = city;
        this.country = country;
    }

}
