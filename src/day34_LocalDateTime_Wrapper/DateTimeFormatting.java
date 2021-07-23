package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        LocalDate today = LocalDate.now();
        System.out.println(today+" today");// default format 2021-07-22

        System.out.println(today.format(DF)+" is printed as we request MM/dd/YYYY");

        DateTimeFormatter DF2 = DateTimeFormatter.ofPattern("MMMM/dd/YYYY");
        System.out.println(today.format(DF2) +" MMMM/dd/YYYY is printing with 4 charaters of month");


        DateTimeFormatter DF3 = DateTimeFormatter.ofPattern("MMM/dd/YYYY E"); // to format with day of week Thu
        System.out.println(today.format(DF3));
        //DateTimeFormatter DF3 = DateTimeFormatter.ofPattern("MMM/dd/YYYY EEEE"); day of week will be print out full name

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm");
        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);//12:10:49.708 default format
        System.out.println(currentTime.format(TF));//12:10 as we request hh:mm
        //                                           if want to include seconds => ss

        LocalTime time1 = LocalTime.of(17,25);
        System.out.println(time1);//17:25

        DateTimeFormatter TF2 = DateTimeFormatter.ofPattern("hh:mm a"); // =>hours:minutes and AM or PM
        System.out.println(currentTime.format(TF2)); //12:14 PM


        System.out.println("===========================");

        LocalDateTime a = LocalDateTime.now();
        System.out.println(a);// 2021-07-22T12:16:12.578 printed by default format

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY,EEEE hh:mm a");
        LocalDateTime a2 = LocalDateTime.now();
        System.out.println(a2.format(DTF));//July/22/2021,Thursday 12:20 PM

         /*
        1. use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
         */

        System.out.println("======================================");

        DateTimeFormatter formatPrint = DateTimeFormatter.ofPattern("EEEE, hh:mm a,MMM/dd/YYYY");

        LocalDateTime time2 = LocalDateTime.of(2020,11,24, 13,0);
        System.out.println(time2);// give default format => 2020-11-24T13:00

        System.out.println(time2.format(formatPrint)); // printed as we requested => Tuesday, 01:00 PM,Nov/24/2020

        // what day is 222-01-01
       String result =  LocalDate.of(2022,1,1).format(DateTimeFormatter.ofPattern("EEEE") );
        System.out.println(result);// is going to be Saturday

        System.out.println("====================");
        System.out.println(nameOfTheDay(2025,5,28));// Wednesday


    }
    // it will print what day of the week it will be
    public static String nameOfTheDay(int year, int month, int day){
        String result = LocalDate.of(year, month, day).format( DateTimeFormatter.ofPattern("EEEE") );
        return result;
    }
}
