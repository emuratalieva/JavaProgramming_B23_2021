package day37_CustomClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {

        String[] names = {"Esra","Sabir","Raphael","Mousa"};
        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList(names));
        System.out.println(students);

        Collections.swap(students,0,students.size()-1);
        System.out.println(students); //[Mousa, Sabir, Raphael, Esra]


        System.out.println("==========================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,4,5,5,6));

        //option 2
        ArrayList<Integer> uniques = new ArrayList<>(list);
        uniques.removeIf(p-> Collections.frequency(uniques, p) != 1);
        int firstUnique = uniques.get(0);// gets first unique 
        System.out.println(uniques);
        System.out.println(firstUnique);

        //option 1
        /*
        int firstUnique = 0;
        for(Integer each : list){
            if(Collections.frequency(list, each)==1){
                firstUnique+=each;
                break;
            }
        }

         */
     //  System.out.println("firstUnique = " + firstUnique);

        System.out.println("========================================");
        String str = "AABBCCDDEE";
        String result = "";

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str.split("")));
        for(String each : StringUtility.removeDup(str).split("")){//A,B,C,D,E
            int frequency = Collections.frequency(list2,each);         //2,2,2,2,2
            result+=each+frequency;
        }

        System.out.println("list2 = " + list2);
        System.out.println(result);
        System.out.println("==========================================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10));
      //  Collections.sort(numbers);//asc order
      //  Collections.reverse(numbers);// desc
        int n = 5;
        for (int i = 1; i < 5 ; i++) {
            numbers.removeIf(p-> p == Collections.max(numbers));
        }
        int fifthMaxNumber = Collections.max(numbers);
        System.out.println("fifthMaxNumber = " + fifthMaxNumber);
        
       



        



    }
}
