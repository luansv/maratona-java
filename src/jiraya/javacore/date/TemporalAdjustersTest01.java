package jiraya.javacore.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate now2 = LocalDate.now();

        now = now.plusDays(2);
        now2 = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now);
        System.out.println(now2);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
