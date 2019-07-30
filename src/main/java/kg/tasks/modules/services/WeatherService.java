package kg.tasks.modules.services;

import kg.tasks.modules.interfaces.IWeather;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private IWeather weather;

    public void setWeather(IWeather weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather.getWeather();
    }
}
