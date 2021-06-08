package day12_Scanner;

public class Grade {

    public static void main(String[] args) {

        char grade = 'A';
        String result = "";

        switch (grade) {
            case 'A':
                result = "Excellent";
                break;

            case 'B':
                result = "Great Job";
                break;

            case 'C':
                result = "Good";
                break;

            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }

        System.out.println("result = " + result);


    }

}

/*
1. a char variable named grade is given. use switch statement to print the following messages:
                if the grade is 'A' print excellent
                if the grade is 'B' print great job
                if the grade is 'C' print good
                if the grade is 'D' print passed
                if the grade is 'F' print failed
                other wise print invalid
 */