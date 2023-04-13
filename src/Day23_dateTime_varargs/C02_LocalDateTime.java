package Day23_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ltd=LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ltd); //2022-12-22T00:12:40.001022700

        ltd=LocalDateTime.now();
        System.out.println(ltd); //2022-12-21T21:12:40.005023300
        System.out.println(ltd.getDayOfWeek()); //WEDNESDAY

        System.out.println(ltd.withYear(2030)); //2030-12-21T21:15:10.964049400



    }
}
