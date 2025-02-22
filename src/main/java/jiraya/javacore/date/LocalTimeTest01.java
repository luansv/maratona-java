package jiraya.javacore.date;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(22,54,23);
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);
        System.out.println(localTime1.getMinute());
        System.out.println(localTime1.getHour());
        System.out.println(localTime1.getSecond());
        System.out.println(localTime1.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
