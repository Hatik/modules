package kg.tasks.modules.services;

import kg.tasks.modules.interfaces.ICurrency;

public class CurrencyService {
    private ICurrency currency;

    public void setCurrency(ICurrency currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency.getCurrencyRates();
    }
}
