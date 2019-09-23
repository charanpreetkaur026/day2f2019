package ThirdDay;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class TimeTable {
    private static final DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy ");

    public static void main(String[] args) {
        System.out.println("MADT F2019  - Class Timetable Design ");
        System.out.println("---------------------------------------\n");
        Date currentDate = new Date();
        String saturdayOff = "Saturday";
        String sundayOff = "Sunday";
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        if (simpleDateformat.format(currentDate) == sundayOff) {
            System.out.println(simpleDateformat.format(currentDate) + ",\t" + dateFormat.format(currentDate) + "at 17:30 to 21:45");

            // convert date to calendar
            Calendar c = Calendar.getInstance();
            c.setTime(currentDate);
            int i = 0;
            do {
                c.add(Calendar.DATE, 1); //incrementing date by 1
                Date currentDatePlusOne = c.getTime();

                System.out.println(simpleDateformat.format(currentDatePlusOne) + ",\t" + dateFormat.format(currentDatePlusOne) + "at 17:30 to 21:45");
                i++;
                //(simpleDateformat.format(currentDatePlusOne) != sundayOff )
            } while (i < 4);
        } else {
            Calendar c = Calendar.getInstance();
            c.setTime(currentDate);
            int i = 0;
            do {
                c.add(Calendar.DATE, 1); //incrementing date by 1
                Date currentDatePlusOne = c.getTime();

                System.out.println(simpleDateformat.format(currentDatePlusOne) + ",\t" + dateFormat.format(currentDatePlusOne) + "at 17:30 to 21:45");
                i++;
                //(simpleDateformat.format(currentDatePlusOne) != sundayOff )
            } while (i < 5);


            //Period tenDays = Period.ofDays(10);
            //System.out.println(tenDays.getDays()); //10

            Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
            //System.out.println(oneYearTwoMonthsThreeDays.getYears());   //1
            //System.out.println(oneYearTwoMonthsThreeDays.getMonths());  //2
            //System.out.println(oneYearTwoMonthsThreeDays.getDays());    //3

        /*System.out.println("\n--- Period.between --- ");
        LocalDate oldDate = LocalDate.of(2019,Month.SEPTEMBER,20);
        LocalDate newDate = LocalDate.of(2019,Month.SEPTEMBER,23);
        LocalDate currentDateAndTime;
        currentDateAndTime = LocalDate.now();
        System.out.println(currentDateAndTime);
        //LocalDateTime mondayDate = LocalDateTime.of();
        Duration d1 = Duration.between(oldDate, newDate);

        System.out.println(oldDate);
        System.out.println(newDate);

        // check period between dates
        Period period = Period.between(oldDate, newDate);

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");*/


        }
    }
}


