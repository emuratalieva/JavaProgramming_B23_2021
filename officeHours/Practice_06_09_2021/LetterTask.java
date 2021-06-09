package Practice_06_09_2021;

public class LetterTask {
    public static void main(String[] args) {
        /*
        1- Given a character, the task is to check whether the given character is in upper case, lower case, or non-alphabetic 		character

							Input: ch = 'A'
							Output: A is an UpperCase character

							Input: ch = 'a'
							Output: a is an LowerCase character

							Input: ch = '0'
							Output: 0 is not an aplhabetic character
         */

        char ch = 'f';

        if (ch >= 'A' && ch <= 'Z') {

            System.out.println(ch + " is an UpperCase character");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is an Lowercase character");
        } else {
            System.out.println(ch + " is not an aplhabetic character");
        }

            }
}

