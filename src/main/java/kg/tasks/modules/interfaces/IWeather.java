package kg.tasks.modules.interfaces;

import java.io.IOException;
import java.util.Map;

public interface IWeather {
    String getWeather() throws IOException;
    void addParams(Map<String, String> parameters);
}
