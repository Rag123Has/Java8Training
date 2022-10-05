package HomeTask9;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateApiTest {

   public static void main(String[] args) throws ParseException {

       //1. Write a predicate to check if the given date is yesterday date
       Predicate<String> p1= date->{
           LocalDate today = LocalDate.now();
           String yesterday = (today.minusDays(1)).format(DateTimeFormatter.ISO_DATE);
            if(date.equals(yesterday)){
                return true;
            }else
            {
                return false;
            }

       };

       System.out.println(p1.test("2022-10-04"));


       //2. Write a Supplier to get Date for next Thursday
       Supplier<String> s1= ()->{
           LocalDate dt = LocalDate.now();
           return String.valueOf(dt.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
       };

       System.out.println(s1.get());


       //3. Write a Supplier to get CurrentTime in EST timezone

       Supplier<ZonedDateTime> s2 =()->{
           ZoneId z = ZoneId.of( "America/New_York" ) ;
           return (ZonedDateTime.now( z ));

       };


       System.out.println(s2.get());


       //4. Write a Function to calculate the age of a person given date of birth.

       Function<LocalDate, String> f1 = (local)->{

           int year = local.getYear();
           int month= local.getMonthValue();
           int day= local.getDayOfMonth();
           LocalDate l = LocalDate.of(year,month,day);
           LocalDate now = LocalDate.now();
           Period diff = Period.between(l, now);
            return diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days" ;
       };

       System.out.println(f1.apply(LocalDate.of(2016,12,20)));




   }
}
