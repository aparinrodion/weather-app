package com.example.weatherapp.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class WeatherServiceTest {

    @Autowired
    private WeatherService weatherService;

    @Test
    void whenGetWeatherByCity_ThenReturnWeather() {
        //Given
        String cityName = "Minsk";
        //Then
        assertThat(weatherService.getWeatherByCityName(cityName))
                .isEqualTo(String.format("In %s is warm", cityName));
    }
}