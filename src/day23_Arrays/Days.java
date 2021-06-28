package day23_Arrays;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; // size is 7
        //      index:    0                                                                      6

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        System.out.println(days[n-1]);


    }

}
