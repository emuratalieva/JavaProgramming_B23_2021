package Practice_06_09_2021;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {



        /*

        ?  --- if
        :  --- else

        conditon ? true : false;


         */

        int a=5;
        int b=10;

        int r= a>b?a:b;

        System.out.println(r);



        System.out.println("======Task=====");
        int age = 17;
        int weight = 51;




        String result= (age >= 18)?(weight > 50)? "You are eligible to donate blood"  :"You are not eligible to donate blood": "Age must be greater than 18";

        System.out.println("result = " + result);

    }
}

