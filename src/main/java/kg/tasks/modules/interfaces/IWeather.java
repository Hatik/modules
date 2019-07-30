package kg.tasks.modules.interfaces;

import java.util.Map;

public interface IWeather {
    String getWeather();
    void addParams(Map<String, String> parameters);
}
