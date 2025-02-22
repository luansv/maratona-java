package jiraya.javacore.formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeKR = Locale.KOREA;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localePT);
        nfa[2] = NumberFormat.getInstance(localeKR);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 100_000.1234;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }


    }
}
