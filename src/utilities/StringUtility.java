package utilities;

public class StringUtility {



    public static String reverse(String str){ // "ABC"
          //                                    012
        String reverse = ""; //CBA

        for (int i = str.length()-1; i >= 0; i--){ // i : 2, 1, 0
            reverse += str.charAt(i); //
        }

        return reverse;
    }


}
