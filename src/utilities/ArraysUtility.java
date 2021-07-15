package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //adds integer to an int array
    public static int[] addElement(int[] array, int number){
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


    //adds double to a double array
    public static double[] addElement(double[] array,  double number){
        double[] result =  Arrays.copyOf(array, array.length+1 );  //{1.5, 2.5, 3.5, 0.0};
        result[result.length-1] = number; //{1.5, 2.5, 3.5, 4.5};

        return result;
    }


    //adds String to a String array
    public static String[] addElement(String[] array, String str){
        String[] result = Arrays.copyOf(array, array.length + 1) ;//  { A, B, null }
        result[result.length-1] = str; //  { A, B, C }
        return result;
    }


    // adds char to char array
    public static char[] addElement(char[] array, char ch){
        char[] result = Arrays.copyOf(array, array.length + 1) ;//  { A, B, null }
        result[result.length-1] = ch; //  { A, B, C }
        return result;
    }
    
    // returns the maximum number from an array of int
    public static int max(int[] array){
        int max= array[0] ;

        for (int each : array) {
           max =  Math.max( each, max  );
        }
        
        return max;
    }


    // returns the maximum number from an array of double
    public static double max(double[] array){
        double max= array[0] ;

        for (double each : array) {
            max =  Math.max( each, max  );
        }

        return max;
    }


    // returns the minimum number from an array of int
    public static int min(int[] array){
        int min= array[0] ;

        for (int each : array) {
            min =  Math.min( each, min  );
        }

        return min;
    }

    
    // returns the minimum number from an array of double
    public static double min(double[] array){
        double min= array[0] ;

        for (double each : array) {
            min =  Math.min( each, min  );
        }

        return min;
    }





    //1. create a function that can return the maximum number from an array of integer
            // max( new int[]{10,20,30} ) ==> 30



    //2. create a function that can return the minimum number from an array of integer
        // min( new int[]{10,20,30} ) ==> 10





}
