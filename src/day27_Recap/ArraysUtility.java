package day27_Recap;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        int[] number = Arrays.copyOf(nums, 10);  // {1,2,3, 0, 0}

        System.out.println(Arrays.toString(number));

        System.out.println("-------------------------------------------");

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8, 9};

        int[] arr3 = Arrays.copyOf(arr1,   arr1.length+arr2.length );
        System.out.println(Arrays.toString(arr3));

        int i = arr1.length;
        for (int each : arr2){
            arr3[i++] = each;
        }

        System.out.println(Arrays.toString(arr3));


        System.out.println("----------------------------------------------");

        int[] data ={10,20,30,40,50,60,70,80,90};
        int[] someData = Arrays.copyOfRange(data, 2, 6+1 );

        System.out.println( Arrays.toString(someData));

        System.out.println("-------------------------------------");

        char[] characters = new char[26];
        int j = 0;
        for (char k = 'A'; k <= 'Z'; k++){
            characters[j++] = k;
        }

        System.out.println(Arrays.toString(characters));

        char[] first10Letters = Arrays.copyOfRange(characters, 0, 9+1);

        System.out.println( Arrays.toString(first10Letters) );

        char[] last10Letters = Arrays.copyOfRange(characters, characters.length-10, characters.length );

        System.out.println(Arrays.toString(last10Letters));





    }


}
