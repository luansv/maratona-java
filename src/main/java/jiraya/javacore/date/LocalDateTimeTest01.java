package jiraya.javacore.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2030, Month.AUGUST, 6);
        LocalTime localTime = LocalTime.of(9, 45, 6);
        System.out.println(localDateTime);

        //It will print the date (localDate) at the hour localTime
        LocalDateTime localDateTime1 = localDate.atTime(localTime);
        System.out.println(localDateTime1);
    }
}
