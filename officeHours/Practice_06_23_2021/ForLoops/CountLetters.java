package Practice_06_23_2021.ForLoops;

public class CountLetters {
    public static void main(String[] args) {
        /*
        Task 6 : Count upper, lower, and numbers


					        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.

					        Input: 2juMp41EEkd4s4

					        Output:
					        3 uppercase letters   result : MEE
					        6 lowercase letters   result : jupkds
					        5 numbers             result : 24144
         */

        String word="2juMp41EEkd4s4";
        int upperChars=0,lowerChars=0,numberChars=0;
        String upperCase="",lowerCase="",number="";

        for (int i = 0; i <word.length() ; i++) {


            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                upperChars++;
                upperCase+=word.charAt(i);
            }else if (word.charAt(i)>='a' && word.charAt(i)<='z'){
                lowerChars++;
                lowerCase+=word.charAt(i);
            }else if(word.charAt(i)>='0' && word.charAt(i)<='9'){
                numberChars++;
                number+=word.charAt(i);
            }

        }

        System.out.println("upperCase = " + upperCase+ " "+ upperChars);
        System.out.println("lowerCase = " + lowerCase+ " "+ lowerChars);
        System.out.println("numbers = " + number+ " "+ numberChars);
    }
}
