package day19_Loops;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        String name = new Scanner(System.in).nextLine();
        //index:       01234567

        String reverseName = "Muhtar";  //rathuM

        for (int i = name.length()-1; i >= 0; i--) {
             reverseName += name.charAt(i); // getting the characters starting from last index to index 0
        }

        System.out.println(reverseName);



    }

}
