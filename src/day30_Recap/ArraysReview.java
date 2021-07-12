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


        System.out.println("-----------------------------------------------------");

        int[] nums = {10, 20, 30, 40, 50};
        // index:     0,  1,  2,  3,   4

        int[] result = new int[nums.length]; //[50, 40, 30, 20, 10]
        //                                      0,  1,   2,  3,  4

        for(int i = nums.length-1, j = 0 ; i >=0; i-- , j++){
           result[j]  = nums[i];
        }

        System.out.println(Arrays.toString(result));


        System.out.println("--------------------------------------------");

        String[] group1 = {"Sophie", "Feruza", "Ekaterina"}; // i
        String[] group2 = {"Shazia", "Bilguun", "Danka", "Mucahit"}; //j

        String[] group3 = new String[group1.length + group2.length]; //k

        int k = 0;
        for(int i = 0; i <= group1.length-1; i++ ){
            group3[k++] = group1[i]; //
        } // 4

        for(int j = 0; j <= group2.length-1; j++){
            group3[k++] = group2[j];
        }


        System.out.println( Arrays.toString(group3));












    }

}
