package day08_IfStatements;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 95;

        boolean madeA = score >= 90 && score <= 100;
        boolean madeB = !madeA && score >= 80; // did not make A and score is greater or equal to 80
        boolean madeC =  !madeA && !madeB && score >= 70; // did not make A & B  and score is greater than 70
        boolean madeD = !madeA && !madeB && !madeC && score >= 60; // did not make A, B, C and score is greater than 60
        boolean madeF = !madeA && !madeB && !madeC && !madeD;


        if(madeA){
            System.out.println("Excellent, You made an A");
        }

        if(madeB){
            System.out.println("Good job, You made a B");
        }

        if(madeC){
            System.out.println("Good, You made a C");
        }

        if(madeD){
            System.out.println("You made a D");
        }

        if(madeF){
            System.out.println("Failed");
        }






    }


}
