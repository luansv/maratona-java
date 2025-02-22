package jiraya.javacore.designpatterns.test;

import jiraya.javacore.designpatterns.domain.*;

public class DataTransferObjectTest {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft();
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person.PersonBuilder
                .Person()
                .firstName("Luan")
                .lastName("Sas")
                .build();

        ReportDto.ReportDtoBuilder.builder();
    }
}
