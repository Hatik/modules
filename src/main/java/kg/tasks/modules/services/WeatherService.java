package kg.tasks.modules.services;

import kg.tasks.modules.interfaces.IWeather;
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
}
