package day24_Arrays;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        // split
        String sentence = "I love learning java programming language";

        String[] words =  sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i]+" ");
        }

        System.out.println();

        String email = "James@gmail.com";

         String[] arrays =  email.split("@"); //{James, gmail.com}
        System.out.println(Arrays.toString(arrays));

        String firstname = arrays[0];

       System.out.println("firstName = " + firstname);

       // toCharArray()

        String str = "ABCDE!@#$!";
        char[] characters = str.toCharArray();

        System.out.println( Arrays.toString(characters));





    }

}
