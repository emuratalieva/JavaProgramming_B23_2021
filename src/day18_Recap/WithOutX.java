package day18_Recap;

import java.util.Scanner;

public class WithOutX {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next(); //"Xcode"

       // if( word.charAt(0) == 'x'  )
        if(word.toLowerCase().startsWith("x")  ){
            // "xcode"
            System.out.println( word.substring(1) );
        }else{
            System.out.println(word);
        }


        scan.close();


    }

}

/*
1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode

                    Output:
                        code
 */
