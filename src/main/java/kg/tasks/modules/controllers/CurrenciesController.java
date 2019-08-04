package kg.tasks.modules.controllers;

import kg.tasks.modules.models.CbrCurrency;
import kg.tasks.modules.models.currency.ValuteCursOnDate;
import kg.tasks.modules.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/currency")
@CrossOrigin
public class CurrenciesController {
    @Autowired
    private CurrencyService currencyService;

    @GetMapping
    public List<ValuteCursOnDate> getCurrencies(){
        currencyService.setCurrency(new CbrCurrency());
        ArrayList<String> listOfCurrencies = new ArrayList<>(){
            {
                add("usd");
                add("eur");
                add("aud");
            }
        };
        return currencyService.getCurrency(listOfCurrencies);
    }
}
