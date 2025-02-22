package jiraya.javacore.formatting;

import java.util.Calendar;
import java.text.DateFormat;
import java.util.Locale;

public class LocaleDateExample {
    public static void main(String[] args) {

        // Creating Locale objects for different countries and languages
        Locale localeItaly = new Locale("it", "IT"); // Italian in Italy
        Locale localeCH = new Locale("it", "CH"); // Italian in Switzerland
        Locale localeIndia = new Locale("hi", "IN"); // Hindi in India
        Locale localeChina = new Locale("xh", "CN"); // Xhosa in China (may be incorrect as Xhosa is not common in China)
        Locale localeJapan = new Locale("ja", "JP"); // Japanese in Japan
        Locale localeThailand = new Locale("th", "TH"); // Thai in Thailand

        // Creating a Calendar instance to get the current date
        Calendar calendar = Calendar.getInstance();

        // Creating DateFormat instances for each locale, using FULL date style
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly); // FULL date style for Italy
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH); // FULL date style for Switzerland
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia); // FULL date style for India
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeChina); // FULL date style for China
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan); // FULL date style for Japan
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeThailand); // FULL date style for Thailand

        // Printing the current date in the full format for each locale
        System.out.println("Italy: " + df1.format(calendar.getTime())); // Date in Italy format
        System.out.println("Switzerland: " + df2.format(calendar.getTime())); // Date in Switzerland format
        System.out.println("India: " + df3.format(calendar.getTime())); // Date in India format
        System.out.println("China: " + df4.format(calendar.getTime())); // Date in China format
        System.out.println("Japan: " + df5.format(calendar.getTime())); // Date in Japan format
        System.out.println("Thailand: " + df6.format(calendar.getTime())); // Date in Thailand format

        // Using getDisplayCountry to display country names in different languages
        System.out.println(localeChina.getDisplayCountry(localeIndia)); // Displaying the country name of China in Hindi
        System.out.println(localeThailand.getDisplayCountry(localeJapan)); // Displaying the country name of Thailand in Japanese
    }
}
