package day19_Loops;

import java.util.Scanner;

public class ForLoopPractice3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 8 ; i++) { // i:0,1,2,3,4,5,6,7,8,    9
            System.out.println("\t\t* * * * * * ");

        }


        System.out.println("--------------------------------------------");

        System.out.println("* * * * * *");
        for (int i = 1; i <=8 ; i++) {
            System.out.println("*         *");
        }
        System.out.println("* * * * * *");

        System.out.println("--------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= num ; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);




    }

}
/*
2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *


3. print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *

    Hint: in the loop body , only place the statements that you need to repeat


4. write a program that can calculate the sum of all numbers between 1 to 100

 */