package day33_Methods;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTask3 {


    public static void main(String[] args) {
        int[] array = {1,1,1,2,3,3,4,5,5,6};
        int[] result = {} ;  // {2, 4, 6}


        for (int each : array) { // getting each elements
            if(  frequency(array, each)  == 1   ){ // unique element
               result =  ArraysUtility.addElement(result, each );
            }
        }

        System.out.println(Arrays.toString(result));

        System.out.println("----------------------------------");

        int[] array2 = {100, 200, 100, 200, 300, 400, 500, 600, 600}; //{300, 400, 500}

        int[] r1 = unique(array2);

        System.out.println(Arrays.toString(r1));

        System.out.println("--------------------------------------");

        double[] array3 = {2.5, 2.5, 3.5, 4.5, 5.5, 5.5, 6.5};

        double[] r2 = unique(array3);

        System.out.println(Arrays.toString(r2));

        System.out.println("-----------------------------------");

        String[] items = {"Apple", "Apple", "Orange", "Egg", "Egg", "Cherry"};

        String[] r3= unique(items); //[Orange, Cherry]

        System.out.println(Arrays.toString(r3));




    }


    public static int[] unique(int[] array){
        int[] result = {};

        for (int each : array) { // getting each elements
            if(  frequency(array, each)  == 1   ){ // unique element
                result =  ArraysUtility.addElement(result, each );
            }
        }

        return result;
    }

    public static double[] unique(double[] array){
        double[] result = {};

        for (double each : array) { // getting each elements
            if(  frequency(array, each)  == 1   ){ // unique element
                result =  ArraysUtility.addElement(result, each );
            }
        }

        return result;
    }

    public static String[] unique(String[] array){
        String[] result = {};

        for (String each : array) { // getting each elements
            if(  frequency(array, each)  == 1   ){ // unique element
                result =  ArraysUtility.addElement(result, each );
            }
        }

        return result;
    }

    public static char[] unique(char[] array){
        char[] result = {};

        for (char each : array) { // getting each elements
            if(  frequency(array, each)  == 1   ){ // unique element
                result =  ArraysUtility.addElement(result, each );
            }
        }

        return result;
    }


    public static int frequency(int[] array, int element){
        int count = 0;

        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    public static int frequency(double[] array, double element){
        int count = 0;

        for (double each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    public static int frequency(String[] array, String element){
        int count = 0;

        for (String each : array) {
            if(each.equals( element ) ){
                count++;
            }
        }

        return count;
    }

    public static int frequency(char[] array, char element){
        int count = 0;

        for (char each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }






}
/*
Task3:
	    1. create method that accepts one integer array and one integer number and returns the frequency of the number
	                Ex:
	                    int[] array ={1,1,1,1,1,2,2};

	                    frequency(array, 2) ==> 5

	    2. create method that accepts one double array and one double number and returns the frequency of the number


	    3. create method that accepts one String array and one String and returns the frequency of the String
	            Ex:
	                String[] array = {"Apple", "Apple", "Apple", "Orange"}

	                frequency(array, "Orange") ==> 1

	    4. create method that accepts one char array and a char and returns the frequency of the char
 */