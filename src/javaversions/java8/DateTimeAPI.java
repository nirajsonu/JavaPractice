package javaversions.java8;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class DateTimeAPI {
    public static void main(String[] args) {
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("dd/mm/yyy");
        System.out.println( simpleFormatter.format(new Date()));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);

        Duration duration = Duration.ofHours(5);
        System.out.println("5 hours duration: " + duration);

        Period period = Period.ofMonths(2);
        System.out.println("2 months period: " + period);
    }
}
