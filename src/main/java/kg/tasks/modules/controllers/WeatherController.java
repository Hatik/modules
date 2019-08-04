package kg.tasks.modules.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.tasks.modules.configs.Config;
import kg.tasks.modules.models.AccuWeather;
import kg.tasks.modules.models.ResponseEntity;
import kg.tasks.modules.models.weather.Weather;
import kg.tasks.modules.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
@CrossOrigin
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public ResponseEntity getWeather() {
        ResponseEntity response = new ResponseEntity();
        try {
            weatherService.setWeather(new AccuWeather("222844", getParams()));
            response.setData(weatherService.getWeather());
        } catch (Exception e) {
            response.setSuccess(false);
            response.setMessage(e.toString());
        }

        return response;
    }

    @GetMapping("/v2")
    public ResponseEntity getWeatherObject() {
        ResponseEntity response = new ResponseEntity();
        try {
            weatherService.setWeather(new AccuWeather("222844", getParams()));
            ObjectMapper objectMapper = new ObjectMapper();

            Weather weather = objectMapper.readValue(weatherService.getWeather(), Weather.class);
            response.setData(weather);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setMessage(e.toString());
        }

        return response;

    }

    private Map<String, String> getParams() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("apikey", Config.getApiKey());
        parameters.put("language", Config.getLanguage());
        parameters.put("details", Config.getIsDetailsString());
        parameters.put("metric", Config.getIsMeticString());
        return parameters;
    }

}
