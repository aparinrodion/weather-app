package com.example.weatherapp.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public static final String API_KEY = "1ac90506cf2b80882e942338e1da0656";

    public String getWeatherByCityName(String city) {
        return String.format("In %s is warm", city);
    }
}
