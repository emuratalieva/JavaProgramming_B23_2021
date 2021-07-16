package day33_Methods;

import java.util.Arrays;

public class WarmUpTask0 {

    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500, 600};

        System.out.println(Arrays.toString(numbers));

        numbers = remove( numbers,  1 ); //{100, 200, 300, 500, 600}


        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------");

        double[] array1 = {6.5, 7.5, 8.5, 9.5};     // index 2
        System.out.println(Arrays.toString(array1));

        array1 = remove(array1, 2);    //  {6.5, 7.5, 9.5}

        System.out.println(Arrays.toString(array1));



    }


    // remove the element at given index of the array
    public static int[] remove(int[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        int[] result = new int[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // moves all the elements of array except the element at given index
                continue;
            }else{
             result[j++]  = array[i];
            }
        }

        return result;
    }


    // remove the element at given index of the array
    public static double[] remove(double[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        double[] result = new double[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    //{1,2,3,4,5} , 2

    //{1,2,4,5}



}
