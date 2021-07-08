package Practice_07_07_2021;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        /*

	Task 2 :	Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
        		 trash can
         		 dish washer
         */

        String words="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";


        // find index of ,
        // find substring until comma
        // use trim
        // check contains " "
        // replace word with ""

        String[] split = words.split(", ");

        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));

       /* for (int i = 0; i < split.length; i++) {

            if(split[i].contains(" ")){
                System.out.println(split[i]);
            }

        }
        */


        for (String eachWord:split) {
            if(eachWord.contains(" ")){
                System.out.println(eachWord);

            }
        }
        

    }
}
