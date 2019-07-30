package kg.tasks.modules.models;

import kg.tasks.modules.helpers.ParameterStringBuilder;
import kg.tasks.modules.helpers.RequestHelper;
import kg.tasks.modules.interfaces.IWeather;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class AccuWeather implements IWeather {

    private String locationCode;
    private String url;

    public AccuWeather(String locationCode, Map<String, String> parameters) {
        this.locationCode = locationCode;
        url = "http://dataservice.accuweather.com/forecasts/v1/daily/1day/" + locationCode;
        addParams(parameters);
    }

    @Override
    public void addParams(Map<String, String> parameters) {
        try {
            url += "?" + ParameterStringBuilder.getParamsString(parameters);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getWeather() {
        RequestHelper helper = new RequestHelper();

        try {
            return helper.sendGetRequest(url);
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }
}
