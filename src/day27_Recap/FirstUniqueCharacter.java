package day27_Recap;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "aaabccddefggggh";  // b, e, f, h

        // indexOf('c') ==>4
        //lastIndexOf('c') ==> 5

        /*
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
        }
         */

        for (char each : str.replace(" ", "").toCharArray() ){ // each: represents each characters of str, excluding the space

            if(str.indexOf(each)  == str.lastIndexOf(each)){ // if the charcter' first and last index number in string are same, then the character is unique

                System.out.println(each);
               break;
            }

        }





    }


}
