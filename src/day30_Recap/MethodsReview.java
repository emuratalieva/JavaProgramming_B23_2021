package day30_Recap;

import utilities.StringUtility;

public class MethodsReview {

    public static void main(String[] args) {

        String str = "Java";

       String r = StringUtility.reverse( str );

        System.out.println(r);


        String word = "Anna";

        System.out.println(   StringUtility.isPalindrome( word )   );


    }

}
