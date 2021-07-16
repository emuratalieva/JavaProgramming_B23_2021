package day33_Methods;

import java.util.Arrays;
import utilities.ArraysUtility;

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

        System.out.println("----------------------------------------------------");

        String[] students = {"Dilem", "Aysu", "Mucahit", "Tugba", "Fhilipp"};  // index 2

        students = remove(students, 2); // [Dilem, Aysu, Tugba, Fhilipp]

        System.out.println(Arrays.toString(students));

        students = remove(students, 3);

        System.out.println(Arrays.toString(students));


        System.out.println("-------------------------------------------------------");

        char[] chars1 = {'A', 'B', 'C', 'D', 'E'};
        char[] chars2 = {'F', 'G', 'H', 'I', 'J'};

         char[] chars3 = ArraysUtility.merge(chars1, chars2);

        System.out.println(Arrays.toString(chars3));








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


    // remove the element at given index of the array
    public static String[] remove(String[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        String[] result = new String[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    // remove the element at given index of the array
    public static char[] remove(char[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        char[] result = new char[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }





}
