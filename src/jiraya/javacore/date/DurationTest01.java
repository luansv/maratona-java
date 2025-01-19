package jiraya.javacore.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now1 = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        System.out.println(nowAfterTwoYears);

        LocalTime now2 = LocalTime.now();
        LocalTime timeMinus7Hours= LocalTime.now().minusHours(7);
        System.out.println();

        Duration duration = Duration.between(now1, nowAfterTwoYears);
        System.out.println(duration);
    }
}
