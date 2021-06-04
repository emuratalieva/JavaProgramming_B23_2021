package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {
        int score = 75;

        if(score >= 90 && score <= 100 ){ //90, 91, 92, 93, 94...100
            System.out.println("Excellent, You made an A");
        }

        if( score>=80 && score <= 89){ // 80, 81, 82, 83, 84... 89
            System.out.println("Good job, You made a B");
        }

        if(score>=70 && score <= 79){ // if score is between 70 to 79:
            System.out.println("Good, You made a C");
        }

        if(score>= 60 && score <= 69){
            System.out.println("You made a D");
        }

        if(score < 60){
            System.out.println("Failed");
        }



    }

}

/*
score

grade:
    A: 90 <= score <= 100
    B: 80 <= score <= 89
    C: 70 <= score <= 79
    D: 60 <= score <= 69
    F: score < 60

 */


