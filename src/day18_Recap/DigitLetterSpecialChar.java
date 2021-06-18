package day18_Recap;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        char f = word.charAt(0);

        String result = "First character is ";

        if(f >= '0' && f <= '9'){
           result += "digit";
        }else if( f>= 'a' && f <= 'z'){
            result += "lowercase letter";
        }else if( f>= 'A' && f <= 'Z'){
            result += "uppercase letter";
        }else{
            result += "special character";
        }

        System.out.println(result);
        scan.close();


    }

}


/*
3. Ask user to enter a word,
		if the word starts with digits, print "first character is digit"
		if the word starts with uppercase letters, print "first character is lowercase letter"
		if the word starts with lowercase letters, print "first character is uppercase letter"
		if the word starts with special characters, print "first character is special character"

 */