package Practice_06_16_2021.StringPractice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        (substring-length-isEmpty)

				2.Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

					Input :"Hello"   → "He"
					Input :"abcdefg" → "ab"
					Input :"a"	     → "a"
					Input :""	     → "It can not be empty"
         */


        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        int length = word.length();
        // Cybertek  = 8
        // 01234567
        // length()-1


        // System.out.println(word.substring(3));
        // System.out.println(word.substring(0,2));


        if (word.isEmpty()) {
            System.out.println("it can not be empty");
        } else if (word.length() < 2) {
            System.out.println(word);
        } else {
            //char
            System.out.println(word.charAt(0) + "" + word.charAt(1));
            //substring
            System.out.println(word.substring(0, 2));
        }


    }
}
