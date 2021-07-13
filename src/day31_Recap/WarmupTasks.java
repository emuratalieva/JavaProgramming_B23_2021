package day31_Recap;

public class WarmupTasks {


    public static void main(String[] args) {

        String str = "MMMMMNNNNNNNNBBBBBBBAAAZZZZZZZDDDDDDDDDD";

        System.out.println(   removeDup( str )  );
        String r = removeDup( str );

        System.out.println(r);




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


    //"AAABBBBCCCC" ===> "ABC"

}
