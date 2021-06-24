package day21_Loops;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt(); // 100

        if(n <= 0){
            System.err.println("Invalid Number");
            System.exit(0); // terminates the system
        }

        String result1 = "Divisible by 15: ";
        String result2 = "Divisible by 5: ";
        String result3 = "Divisible by 3: ";

        for (int i = 1; i <= n ; i++) { // i: 1,2,3,4,5.... 100

            if (i%15 ==0){
                result1 += i+" ";
            }else if(i % 5 == 0){
                result2 += i+" ";
            }else if(i%3==0){
                result3 += i+" ";
            }

        }

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);



        scan.close();






    }



}
/*
2.  Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
            if the number can be divisible by 3, 5 and 15,
                then it should only be displayed in DivisibelBy15' section

            if the number can be divisible by 3 but cannot be divisible by 15,
                then it should only be displayed in DivisibelBy3' section

            if the number can be divisible by 5 but cannot be divisible by 15,
                then it should only be displayed in DivisibelBy5' section

            EX:
            	input: 100
	            Output:
	                 Divisible By 15: 15 30 45 60 75 90
	                 Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
	                 Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */


