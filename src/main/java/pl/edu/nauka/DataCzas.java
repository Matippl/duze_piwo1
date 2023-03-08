package pl.edu.nauka;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DataCzas {
    public static void main(String[] args) throws InterruptedException {
        var start = Instant.now();
                Thread.sleep(500);
                var koniec = Instant.now();
       Duration roznica = Duration.between(start,koniec);
       var sekundy = roznica.getSeconds();
       System.out.println(sekundy);

       LocalDate urodzony = LocalDate.of(2006, Month.DECEMBER,4);
       System.out.println(urodzony);
       System.out.println(urodzony.getDayOfYear());
        System.out.println(urodzony.getDayOfWeek());
        LocalDate dp =LocalDate.of(2023,1,1).plusDays(100);
        System.out.println(dp);
        System.out.println(MonthDay.now());
        LocalDate pierwszasroda = LocalDate.of(2023 ,3,1).with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
        System.out.println(pierwszasroda);
        System.out.println(LocalTime.now());
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant instant = zdt.toInstant();
        ZonedDateTime terazAsia = instant.atZone(ZoneId.of("Asia/Vladivostok"));
        ZonedDateTime terazAfrica = instant.atZone(ZoneId.of("Africa/Libreville"));
        System.out.println("nasz" + zdt);
        System.out.println("Asia"  + terazAsia);
        System.out.println("Africa" + terazAfrica);

        var dzienUrodzin = LocalDate.of(2006,Month.DECEMBER,04);
        var dzienDzisiejszy = LocalDate.now();
         var period = Period.between(dzienUrodzin,dzienDzisiejszy);
        System.out.println("Zyje:" + dzienUrodzin.until(dzienDzisiejszy, ChronoUnit.DAYS) + " dni. ");
    }

}


