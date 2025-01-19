package jiraya.javacore.formatting;

import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // Print the default Locale of the system
        System.out.println(Locale.getDefault()); // Outputs the default locale (e.g., en_US)

        // Get an array of all ISO country codes
        String[] isoCountries = Locale.getISOCountries();

        // Get an array of all ISO language codes
        String[] isoLanguages = Locale.getISOLanguages();

        // Iterate over and print all ISO language codes
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " "); // Prints the language codes like 'en', 'fr', 'de', etc.
        }

        // Iterate over and print all ISO country codes
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " "); // Prints the country codes like 'US', 'FR', 'DE', etc.
        }
    }
}
