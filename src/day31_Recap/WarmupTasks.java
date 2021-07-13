package day31_Recap;

import java.util.Arrays;

public class WarmupTasks {


    public static void main(String[] args) {

        String str = "MMMMMNNNNNNNNBBBBBBBAAAZZZZZZZDDDDDDDDDD";

        System.out.println(   removeDup( str )  );
        String r = removeDup( str );

        System.out.println(r);

        System.out.println("---------------------------------------");
        String s1 = "Java",
                s2 = "Batch 23";

        System.out.println(  isAnagram(s1, s2)  );




    }


    // create a method that can remove duplicates from string, returns string
    public static String removeDup(String str){ // "AABBBCC"
        String result = "";   //"ABB"

        for (char ch : str.toCharArray() ) { //{'A', 'A', 'B', 'B', 'B', 'C', 'C'}

            if( !result.contains( ""+ch)){  //result.indexOf(ch) < 0
                // if the character is not contained in the result, then concate the character
               result += ch;
            }

        }

        return result;
    }

    // "heart"  & "earth"  ==> isAnagram ==> true
    public static boolean isAnagram(String str1, String str2){
        char[] ch1 = str1.toCharArray(); //{'h', 'e', 'a', 'r', 't'}
        char[] ch2 = str2.toCharArray(); // {'e', 'a', 'r', 't', 'h'}

        Arrays.sort(ch1); // {a, e, h, r. t}
        Arrays.sort(ch2); // {a, e, h, r. t}

        return  Arrays.equals(ch1, ch2);

    }



}
