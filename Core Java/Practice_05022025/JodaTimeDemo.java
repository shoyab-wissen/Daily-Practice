package Practice_05022025;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*;
import java.time.Month;
import java.time.ZoneId;
import java.util.Set;
import java.util.TimeZone;;

public class JodaTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        date.withMonth(Month.MARCH.getValue());

        LocalDate date2 = LocalDate.of(2024, MARCH, 22);
        System.out.println(date2);

        LocalTime time2 = LocalTime.now(ZoneId.of("Singapore"));
        System.out.println(time2);
        Set<String> zones = ZoneId.getAvailableZoneIds();
        zones.forEach(System.out::println);
        LocalTime time3 = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(time3);
    }
}
