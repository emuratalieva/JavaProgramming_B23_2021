package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        String name = "Muhtar";

        int score = 60;
        boolean passed = score >= 60; // true


        if(passed){ // if student passed the exam
            System.out.println("Congrats "+name+" passed the exam");
        }


       if(!passed) { // if student failed the exam
           System.out.println(name+" failed the exam");
       }






    }

}
