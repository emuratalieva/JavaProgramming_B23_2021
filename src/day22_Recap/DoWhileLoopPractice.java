package day22_Recap;

import java.util.Scanner;

public class DoWhileLoopPractice {

    public static void main(String[] args) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int i = 0;
        do{

           if(i%2==0){
               sumOfEven +=i;
           }else{
               sumOfOdd += i;
           }

            i++;
        }while(i <= 10); // i: 0,1,2,3,4,5,6,7,8,9,10

        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);


        System.out.println("----------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        String username = "JohnJames";
        String password = "John123";
        String u ="";
        String p ="";
        int attempts =0;
        while(  !(u.equals(username) && p.equals(password))  ){ // while the credentials are incorrect
            System.out.println("Enter your username:");
            u = scan.next();

            System.out.println("Enter your password:");
            p = scan.next();
            attempts++;

            if(attempts == 3){
                System.err.println("Your account is locked");
                System.exit(0);
            }

        }


        /*
        do{
            System.out.println("Enter your username:");
            u = scan.next();

            System.out.println("Enter your password:");
            p = scan.next();

        }while(  !(u.equals(username) && p.equals(password))  ); // while the credentials are incorrect
        */

        System.out.println("Logged In");



    }


}

/*
Write a program using while loop, that calculates the sum of the even numbers between 0 and 10
 */
