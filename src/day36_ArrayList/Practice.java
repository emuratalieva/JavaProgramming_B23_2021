package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.addAll( Arrays.asList( "Anna", "Racecar", "Level", "Java", "Python", "Cybertek", "Sabas", "Pop", "Kayak" ));

        for (String each : words) {
            String reverse="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+= each.charAt(i);
            }
            boolean isPalindrome= reverse.equalsIgnoreCase(each);
            words.removeIf( p-> isPalindrome);

        }
        System.out.println(words);
    }
}
