package Practice_07_14_2021.MethodTasks;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {

        String input="  Hello world      I      love      Java    ";
        removeSpaces(input);

    }
    /*
      Task 3 :    Write a method that can remove  all extra space from String


    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java
     */

    public static void removeSpaces(String str){

        String result="";
        String[] s = str.trim().split(" ");
        System.out.println("Arrays.toString(s) = " + Arrays.toString(s));

        for (String each : s) {
            if(!each.isEmpty()){
                result+=each+" ";
            }

        }

        System.out.println(result);

    }
}
