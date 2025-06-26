package java8;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;
import java.util.logging.SimpleFormatter;

public class DateTimeAPI {
    public static void main(String[] args) {
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("dd/mm/yyy");
        simpleFormatter.format(new Date());
        System.out.println(simpleFormatter);



    }
}
