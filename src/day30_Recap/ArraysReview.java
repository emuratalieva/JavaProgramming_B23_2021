package day30_Recap;

import java.util.Arrays;

public class ArraysReview {


    public static void main(String[] args) {

/*
        String item = "Eggs",
                item2 = "Milk",
                item3 = "Apple",
                item4 = "Chicken",
                item5 = "Papers";

 */


        String[] items = new String[10]; // index: 0 ~ 9

        items[2] = "Milk";
        items[3] = "Paper Towels";
        //items[10] = "Grape";

        System.out.println(Arrays.toString( items) );


        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        //         index: 0,1,2,3,4,5,6,7,8,9

        System.out.println( Arrays.toString(numbers));

        for(int i= 0; i <= numbers.length-1; i++ ){  // i: index nums of array
            System.out.println( numbers[i] );
        }









    }

}
