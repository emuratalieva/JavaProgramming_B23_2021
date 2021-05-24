package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Christian";
        String lastName = "Cain";
        String fullName = firstName + " "  + lastName;
        String gender = "Male";
        int age = 26;
        String companyName = "Apple Inc";
        String jobTitle = "SDET";

        boolean isFullTime = true;
        boolean isMarried = true;
        int salary = 110000;

        // Aaron King
        // Employee' full name is: Aaron King

        System.out.println( "Employee' full name is: "+fullName );

        // fullName is gender
       // System.out.println("Aaron King is Male");
        System.out.println( fullName + " is "   + gender );

        // fullName is age years old
        System.out.println(fullName + " is " + age+" years old");

        // fullName works at companyName
        System.out.println(fullName + " works at " + companyName);

        //fullName' job title is jobTitle
        System.out.println(fullName + " is " +jobTitle );

        System.out.println(fullName + " is full time employee: " +isFullTime);
        System.out.println(fullName+ " is married: "+isMarried);
        System.out.println(fullName +" is making $ "+salary);



    }


}
/*
1. create a class named EmployeeInfo
                1. declare the following variables:
                   firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                2. full info of the employee
 */