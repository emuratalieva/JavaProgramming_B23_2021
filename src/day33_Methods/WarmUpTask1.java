package day33_Methods;

import java.util.Arrays;

public class WarmUpTask1 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        numbers =  reverse(numbers);

        System.out.println(Arrays.toString(numbers));

        char[] chars = {'A', 'B', 'C'};

        chars = reverse(chars);



    }


    //create a method that can reverse an array of integer
    public static int[] reverse (int[] array){
        int[] result = new int[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }

    //create a method that can reverse an array of double
    public static double[] reverse (double[] array){
        double[] result = new double[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }

    //create a method that can reverse an array of String
    public static String[] reverse (String[] array){
        String[] result = new String[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }

    //create a method that can reverse an array of char
    public static char[] reverse (char[] array){
        char[] result = new char[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }



}

/*
Task 1:
		1. create a method that can reverse an array of integer

		2. create a method that can reverse an array of double

		3. create a method that can reverse an array of String

		4. create a method that can reverse an array of char

 */