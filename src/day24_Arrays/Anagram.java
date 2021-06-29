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
        String s1 = "race";  //aethr
        String s2 = "care"; //aethr

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();  //  ==

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

       boolean isAnagram =  Arrays.equals(ch1, ch2);


        System.out.println("isAnagram = " + isAnagram);



    }




}
