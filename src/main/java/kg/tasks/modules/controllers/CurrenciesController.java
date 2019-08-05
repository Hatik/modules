package kg.tasks.modules.controllers;

import kg.tasks.modules.models.CbrCurrency;
import kg.tasks.modules.models.util.ResponseEntity;
import kg.tasks.modules.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/currency")
@CrossOrigin
public class CurrenciesController {
    @Autowired
    private CurrencyService currencyService;

    @GetMapping
    public ResponseEntity getCurrencies(){
        ResponseEntity response = new ResponseEntity();
        try {
            currencyService.setCurrency(new CbrCurrency());
            ArrayList<String> listOfCurrencies = new ArrayList<>() {
                {
                    add("usd");
                    add("eur");
                    add("aud");
                }
            };
            response.setData(currencyService.getCurrency(listOfCurrencies));
        } catch (Exception e) {
            response.setSuccess(false);
            response.setMessage(e.toString());
        }
        return response;
    }
}
