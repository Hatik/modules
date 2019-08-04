package kg.tasks.modules.services;

import kg.tasks.modules.interfaces.ICurrency;
import kg.tasks.modules.models.currency.ValuteCursOnDate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CurrencyService {
    private ICurrency currency;

    public void setCurrency(ICurrency currency) {
        this.currency = currency;
    }

    public List<ValuteCursOnDate> getCurrency(ArrayList<String> cur) {
        List<ValuteCursOnDate> currencies = currency.getCurrencyRates();

        return currencies.stream().filter(x -> cur.contains(x.getVchCode().toLowerCase())).collect(Collectors.toList());
    }
}
