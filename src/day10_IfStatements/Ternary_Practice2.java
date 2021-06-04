package day10_IfStatements;

public class Ternary_Practice2 {

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        // ? if keyword    : else keyword.   condition needs to be bore ?
        int number = 100;

        /*
        String result = "";

        if(number > 0){
            result = "Positive";
        }else if(number < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
         */

        String result = (number > 0) ? "Positive" :(number < 0)? "Negative" : "Zero";

        System.out.println("------------------------------------------------------------");
        int score  = 100;

        /*
        char grade = ' ';
        if(score >= 90){
            grade = 'A';
        }else if(score >= 80){
            grade = 'B';
        }else if(score >= 70){
            grade = 'C';
        }else if(score >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        */

        char garde =  (score >= 90)? 'A' :(score >= 80)? 'B' :(score >= 70)? 'C' :(score>=60)? 'D' : 'F';


    }


}
