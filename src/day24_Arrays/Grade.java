package day24_Arrays;

public class Grade {

    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char[] grades = new char[names.length]; //{A, C, B}

        for (int i = 0; i <= grades.length-1; i++) {// i:0, 1, 2

           // scores[i]; //90, 75, 80
            if( scores[i] >= 90){
                grades[i] = 'A';
            }else if( scores[i] >= 80){
                grades[i] = 'B';
            }else if( scores[i] >= 70){
                grades[i] = 'C';
            }else if( scores[i] >=60){
                grades[i] = 'D';
            }else{
                grades[i] = 'F';
            }

            System.out.println(names[i]+"' score is "+scores[i]+", made "+grades[i]);

        }









    }

}

/*
2. given the following arrays:
		 String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];

         write a program that can store the gardes of the students in the array named grades
 */
