package kg.tasks.modules.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.tasks.modules.interfaces.IWeather;
import kg.tasks.modules.models.weather.Weather;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeatherService {
    private IWeather weather;

    public void setWeather(IWeather weather) {
        this.weather = weather;
    }

    public String getWeather() throws IOException {
        return weather.getWeather();
    }

    public Weather getWeatherObject() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(getWeather(), Weather.class);
    }
}
