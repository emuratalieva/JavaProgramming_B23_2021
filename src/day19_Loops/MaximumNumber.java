package day19_Loops;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648; // whatever user enters it will be larger than -2147483648
        // max = 50

        for (int i = 0; i < 5; i++) { // 5 times
            System.out.println("Enter a number:");
            int n = scan.nextInt(); // 10, 50, 20, 30, 5

            if(n > max){ //if the user entered number is greater than the max value
               max = n; // then user entered number will be assigned to max variable
            }

        }

        System.out.println("max = " + max);

        scan.close();

    }

}

/*
7. ask user to enter a number for 5 times,  then return the maximum number
 */
