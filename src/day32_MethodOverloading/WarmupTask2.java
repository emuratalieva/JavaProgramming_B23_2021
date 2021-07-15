package day32_MethodOverloading;

import java.util.Arrays;

public class WarmupTask2 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        int element = 10;

        System.out.println(Arrays.toString(array));

        array = addInteger(array, element); //{1,2,3,4,5,6,7,8,9,10}

        System.out.println(Arrays.toString(array));

        array = addInteger(array, 11); //{1,2,3,4,5,6,7,8,9,10, 11}

        System.out.println(Arrays.toString(array));






    }


    public static int[] addInteger(int[] array, int number){
        /*
        int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
             result[i++] =each;
        }

        result[i] = number;
         */

        int[] result = Arrays.copyOf( array,   array.length+1 );
        result[ result.length -1] = number;

        return result;
    }






}

/*
Task2:
	1. create a return method called addElement that can add an Integer  after the  last index of an integer array

    2. create a return method called addElement that can add a double after the last index of a double array

    3. create a return method called addElement that can add a String after the last index of a String array

    4. create a return method called addElement that can add a char after last index of a char array

 */
