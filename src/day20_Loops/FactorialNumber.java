package day20_Loops;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int number = new Scanner(System.in).nextInt();  // 5 * 4 * 3 * 2 * 1
        int result = 1; //

        for(int i =  number;  i >= 1;  i-- ){ //i: 5, 4, 3, 2, 1
            result *= i;
        }

        System.out.println("result = " + result);
/*
6 * 5 * 4 * 3 * 2 * 1
30 * 4 * 3 * 2 * 1
120 * 3 * 2 * 1
360 *2 * 1
720
 */

    }

}
/*
1. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
