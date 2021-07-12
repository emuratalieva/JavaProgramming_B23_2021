package utilities;

public class StringUtility {


    //reverses any given string, and returns it
    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){ // i : 2, 1, 0
            reverse += str.charAt(i); //
        }

        return reverse;
    }


    //checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str){ // "Java"
       String reversedStr =  reverse(str);  //"avaJ"
        return  str.equalsIgnoreCase(reversedStr);
    }


    // create a method that can remove duplicates from string, returns string
            // removeDup("AAABBBBBBCCCCCCC") ===> "ABC"


    // isAnagram




}
