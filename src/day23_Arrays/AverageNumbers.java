package day23_Arrays;

import java.util.Scanner;

public class AverageNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int[] numbers = new int[ scan.nextInt() ];
        int sum = 0;

        for (int i = 0; i <= numbers.length-1 ; i++) { // used for getting the user inputs and store it into the array
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); // assigning user input to the indexes of the array
            sum += numbers[i]; // returns the sum of the elements in the array
        }

        System.out.println("sum = " + sum);
        double average = (double)sum / numbers.length;
        System.out.println("average = " + average);

        scan.close();



    }

}
/*
    4. AverageNumber
    		1. Ask the user how many numbers he/she wants to enter
    		2. get all the inputs from the user
    		3. return the average number
 */
