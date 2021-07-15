package day23_Arrays;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {
        //                    1                                                                         12
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        // index:           0       1      2      3      4      5      6      7       8     9     10      11

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        if(n>=1 && n<=12) {
            System.out.println(months[n - 1]); // index: 12
        }else{
            System.out.println("Invalid Number");
        }






    }


}
