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

public class TimeTable
{
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    public static void main(String[] args)
    {
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
       // LocalDate localDate = LocalDate.now();

        System.out.println("MADT F2019  - Class Timetable Design ");
        System.out.println("---------------------------------------\n");
        Date currentDate = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(currentDate) + "\t" + dateFormat.format(currentDate));

        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        int i=0;
        do{
            // manipulate date
            c.add(Calendar.DATE, 1); //same with c.add(Calendar.DAY_OF_MONTH, 1);
            // convert calendar to date
            Date currentDatePlusOne = c.getTime();
            System.out.println(simpleDateformat.format(currentDatePlusOne) +"\t" + dateFormat.format(currentDatePlusOne) );
            i++;
        }while(i<4);

        //DateTimeFormatter currentDateAndTime = currentDateAndTime.format(now); //2016/11/16 12:08:43
       // LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 31, 10, 20, 55);
        //LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);
        //System.out.println(dtf.format(localDate)); //2016/11/16
       // System.out.println("--- Examples --- ");

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
        System.out.println("hello");
        System.out.println(d1.toString());*/








    }
        //System.out.println(oldDate);
        //System.out.println(newDate);

        // check period between dates
        /*Period period = Period.between(oldDate, newDate);

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");*/



    }



