package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfPractice {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,55,85));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores);
        gradeOfA.removeIf(p ->!(p >= 90 && p <= 100));
        System.out.println("grade A: "+gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);
        gradeOfB.removeIf(p ->!(p >= 80 && p <= 90));
        System.out.println("grade B: "+gradeOfB);



        ArrayList<Integer> gradeOfD = new ArrayList<>(scores);
        gradeOfD.removeIf(p ->!(p >= 60 && p <= 69));
        System.out.println("grade D: "+gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);
        gradeOfF.removeIf(p ->!(p >= 0 && p <= 59));
        System.out.println("grade F: "+gradeOfF);




    }
}
