package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your hourly rate?");
        double hourlyRate = scan.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int weeklyHour = scan.nextInt();

        System.out.println("How many weeks do you work in a year");
        int weeks = scan.nextInt();

        double salary = hourlyRate * weeklyHour * weeks;

        System.out.println("You are making $"+hourlyRate+" per hour");
        System.out.println("You work "+weeklyHour+" hours in a week");
        System.out.println("Your salary is $"+salary);





    }



}

/*
ask the user to enter:
        1. hourlyRate
        2. how many hours do you work in week
        3. how many weeks do you work in a year

 */
