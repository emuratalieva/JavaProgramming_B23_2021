package day24_Arrays;

import java.util.Arrays;

public class Anagram {

    /*
    heart && earth
    race && care
    listen && silent

    output: true
     */

    public static void main(String[] args) {
        String s1 = "race";   //acer
        String s2 = "care";  //acer

        char[] ch1 = s1.toCharArray();  // we can use the sort method
        char[] ch2 = s2.toCharArray();  //  we can use the sort method

        Arrays.sort(ch1); // ch1 will be in ascending order:  a-z
        Arrays.sort(ch2); // ch2 will be in ascending order: a-z

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

       boolean isAnagram =  Arrays.equals(ch1, ch2);


        System.out.println("isAnagram = " + isAnagram);


    }




}
