package kg.tasks.modules.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.tasks.modules.interfaces.ICurrency;
import kg.tasks.modules.models.currency.Currency;
import kg.tasks.modules.models.currency.ValuteCursOnDate;
import kg.tasks.modules.ws.Client;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class CbrCurrency implements ICurrency {

    @Override
    public ArrayList<ValuteCursOnDate> getCurrencyRates() {
        Calendar cal = Calendar.getInstance();

        Client client = new Client();
        String response = client.getXml(cal);

        JSONObject xmlJSONObj = XML.toJSONObject(response);
//        String jsonPrettyPrintString = xmlJSONObj.toString(2);
//        System.out.println(jsonPrettyPrintString);
        ObjectMapper objectMapper = new ObjectMapper();
        List<ValuteCursOnDate> list = new ArrayList<>();
        try {
            Currency currencies = objectMapper.readValue(xmlJSONObj.toString(), Currency.class);
            System.out.println(currencies);
            list = currencies.getValuteData().getValuteCursOnDate();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (ArrayList<ValuteCursOnDate>) list;
    }
}
