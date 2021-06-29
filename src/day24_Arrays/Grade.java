package day24_Arrays;

public class Grade {

    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah", "Abbos", "Yuliang", "Raphael", "Tamerlan", "Muhtar", "Jack"};
        int [] scores = {90, 75, 80, 85, 91, 92, 93, 45, 65};
        char[] grades = new char[names.length]; //{A, C, B}
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        int sum = 0;

        for (int i = 0; i <= grades.length-1; i++) {// i:0, 1, 2

           // scores[i]; //90, 75, 80
            sum += scores[i];
            if( scores[i] >= 90){
                grades[i] = 'A';
                countA++;
            }else if( scores[i] >= 80){
                grades[i] = 'B';
                countB++;
            }else if( scores[i] >= 70){
                grades[i] = 'C';
                countC++;
            }else if( scores[i] >=60){
                grades[i] = 'D';
                countD++;
            }else{
                grades[i] = 'F';
                countF++;
            }

          //  grades[i] = (scores[i] >= 90)?'A' :(scores[i] >= 80)?'B' :(scores[i] >= 70)?'C':(scores[i] >=60)?'D':'F';

            System.out.println(names[i]+"' score is "+scores[i]+", made "+ grades[i]);

        }

        double avg =  (double)sum / grades.length;


        System.out.println("countA = " + countA);
        System.out.println("countB = " + countB);
        System.out.println("countC = " + countC);
        System.out.println("countD = " + countD);
        System.out.println("countF = " + countF);
        System.out.println("avg = " + avg);










    }

}

/*
2. given the following arrays:
		 String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];

         write a program that can store the gardes of the students in the array named grades
 */
