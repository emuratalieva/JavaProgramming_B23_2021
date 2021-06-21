package day19_Loops;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "aabcc";
        //String str = "aabcc";

        String result = "";

        for(int i =0; i<= str.length()-1; i++){

            char ch = str.charAt(i); // a, a, b, c, c
            boolean isUnique =  str.indexOf(ch) == str.lastIndexOf(ch);
            //  if the first and last index numbers of the character are same , then the character is unique

            if(isUnique){ // if the character is unique
                result += ch;
            }

        }

        System.out.println("result = " + result);

    }


}
