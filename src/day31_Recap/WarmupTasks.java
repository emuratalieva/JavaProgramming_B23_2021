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

        System.out.println("------------------------------------");
        String word = "MMMMMMMMMMNNNNNNNNNNNAAAAA";

        int n1 =  frequency(word, 'M');
        System.out.println("n1 = " + n1);

        System.out.println("-------------------------------------");

        String s = "aaaaabcccccdeeeeef";

        String unique = "";

        for(int i = 0; i <= s.length()-1; i++){
            char each = s.charAt(i);
            int frequency =  frequency(s, each);
            if(frequency == 1){
                unique += each;
            }
        }

        System.out.println(unique);

        System.out.println("--------------------------------------------------");
        String s3 = "AAABBCCCC";  //A3B2C4

        String result = ""; //A3B2C4

        for (char each : removeDup(s3).toCharArray()) { // each: A, B C
            int frequency =  frequency(s3, each); // gets the frequency of each character: 3, 2, 4
            result += each ; //"ABC"
            result += frequency;//"A3B2C4"
        }


        System.out.println(result);

        System.out.println("--------------------------------------------");

        String s4 = "MMMMMMMNNNNNNNHHHHHHHYYYYYTTTRREEE";
        String result2 = frequencyOfChars(s4);

        System.out.println(result2);



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

    // frequency("AAAABB" , 'A') ===> 4
    public static int frequency(String str, char ch){
        int count = 0;

        for (char each : str.toCharArray()) { // each: represents each character of str
            if(each == ch){
                count++;
            }
        }
        
        return count;
    }


    // unique characters
    public static String uniqueChars(String s){
        String unique = "";

        for(int i = 0; i <= s.length()-1; i++){
            char each = s.charAt(i);
            int frequency =  frequency(s, each);
            if(frequency == 1){
                unique += each;
            }
        }

        return unique;
    }


    //frequencyOfChars("AAABBBBCC") ==> A3B4C2
    public static String frequencyOfChars(String str){
        String result = ""; //A3B2C4

        for (char each : removeDup(str).toCharArray()) { // each: A, B C
            int frequency =  frequency(str, each); // gets the frequency of each character: 3, 2, 4
            result += each ; //"ABC"
            result += frequency;//"A3B2C4"
        }

        return result;
    }




}
