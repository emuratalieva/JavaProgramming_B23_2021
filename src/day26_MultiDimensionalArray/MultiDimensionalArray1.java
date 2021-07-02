package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray1 {

    public static void main(String[] args) {
        // 2 dimensional array: MUST contain 1 dimensional arrays

        //index:            0,1,2    0,1     0,1,2
        int[][] arr2D = {  {1,2,3}, {4,5} , {6,7,8}   };
        // index:            0,      1,       2

        System.out.println(arr2D.length);

        System.out.println( Arrays.deepToString(arr2D) ); //[[1, 2, 3], [4, 5], [6, 7, 8]]

        System.out.println(Arrays.toString( arr2D[1] ) );  // {4,5}

        System.out.println( arr2D[1][1] ); //5

        System.out.println("---------------------------------------");

        for (int i = 0; i < arr2D.length; i++){//i: index numbers of single dimensional arrays
            //int[] each1DArray = arr2D[i];  // retrieve each single dimensional array
           // System.out.println( Arrays.toString( arr2D[i] ) );
            for (int j = 0; j < arr2D[i].length; j++){ // j: index numbers of the elements in each single single dimensional array
                System.out.print(arr2D[i][j] +" ");
            }
            System.out.println(); // append new line after printing each elements of array in one line


        }

        System.out.println("----------------------------------------");

        for(int[]  each1D  :  arr2D ){

            for(int element  : each1D){
                System.out.print(element+" ");
            }
            System.out.println(); // append new line after printing each elements of array in one line

        }




    }

}
