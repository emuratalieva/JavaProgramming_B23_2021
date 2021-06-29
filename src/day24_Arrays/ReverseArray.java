package day24_Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] reversedArray = new int[array.length]; // enough capacity to contain the elements of original array

        /*
        //{5, 4, 3, 2, 1}
       //             j          i
        reversedArray[0] = array[4]; //5
        reversedArray[1] = array[3]; //4
        reversedArray[2] = array[2]; //3
        reversedArray[3] = array[1]; //2
        reversedArray[4] = array[0]; // 1
         */

            int j= 0;
        for (int i = array.length-1 ; i >=0  ; i--) { // i is the index numbers of array starting from last index
                                                // j is the index numbers of reversedArray starting from index 0
              reversedArray[j++]= array[i]; // we get the elements of array starting last index and store it into reversed array starting from index zero
        }



        System.out.println( Arrays.toString(array) );
        System.out.println( Arrays.toString(reversedArray));


    }

}

/*

4. Write a program that can reverse an array of integers
		ex:
			array = {1,2,3,4,5};

		output:
			reversedArray = {5,4,3,2,1};

 */