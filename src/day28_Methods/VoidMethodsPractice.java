package day28_Methods;

public class VoidMethodsPractice {

    public static void main(String[] args) {

        printOddNumber(100, 125);

    }


    public static void printOddNumber(int from, int to){

        for(int i = from; i <= to;  i++  ){
            if( i %2 != 0 ){
                System.out.print(i+" ");
            }
        }

        System.out.println();

    }

}


/*
 1. create a method that can print odd numbers between 1~100 in a same line seperated by space

    2. create a method that can print even numbers between 1~100

    3. create a method that can calculate the age of the person

    4. check eligibility to vote
 */