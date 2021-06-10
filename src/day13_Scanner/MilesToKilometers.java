package day13_Scanner;

import java.util.Scanner;

public class MilesToKilometers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles");
        double miles = scan.nextDouble();
        double km = miles * 1.609;

        System.out.println(miles+" miles equal to "+km+" kilometers");



    }

}


/*
2. Write a program that can convert Miles to KM
			1 mile = 1.609 km
			Ex:
				Enter miles:
				10.0

				output:
				16.09 kilometers
 */