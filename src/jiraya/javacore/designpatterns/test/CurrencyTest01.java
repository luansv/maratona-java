package jiraya.javacore.designpatterns.test;

import jiraya.javacore.designpatterns.domain.Country;
import jiraya.javacore.designpatterns.domain.Currency;
import jiraya.javacore.designpatterns.domain.CurrencyFactory;

public class CurrencyTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
