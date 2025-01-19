package jiraya.javacore.formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.ISO_DATE);
        String s2 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20250114", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse = LocalDate.parse("2025-01-14+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-01-14", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse);
        System.out.println(parse1);
        System.out.println(parse2);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse3 = LocalDateTime.parse("2025-01-14T14:45:22.3223948", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse3);


        DateTimeFormatter dateTimeFormatterBrazil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = LocalDate.now().format(dateTimeFormatterBrazil);
        System.out.println(format);
        LocalDate parse4 = LocalDate.parse("14/01/2025", dateTimeFormatterBrazil);
        System.out.println(parse4);

        DateTimeFormatter dateTimeFormatterUSA = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatUSA = LocalDate.now().format(dateTimeFormatterUSA);
        System.out.println(formatUSA);

        DateTimeFormatter dateTimeFormatterFrance = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRANCE);
        String formatFR = LocalDate.now().format(dateTimeFormatterFrance);
        System.out.println(formatFR);
        LocalDate parse5 = LocalDate.parse("14.janvier.2025", dateTimeFormatterFrance);
        System.out.println(parse5);

    }
}
