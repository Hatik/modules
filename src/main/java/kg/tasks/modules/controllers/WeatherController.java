package kg.tasks.modules.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.tasks.modules.configs.Config;
import kg.tasks.modules.models.AccuWeather;
import kg.tasks.modules.models.weather.Weather;
import kg.tasks.modules.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public String getWeather(){
        weatherService.setWeather(new AccuWeather("222844", getParams()));
        return weatherService.getWeather();
    }

    @GetMapping("/v2")
    public Weather getWeatherObject(){
        weatherService.setWeather(new AccuWeather("222844", getParams()));
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Weather weather = objectMapper.readValue(weatherService.getWeather(), Weather.class);
            return weather;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
