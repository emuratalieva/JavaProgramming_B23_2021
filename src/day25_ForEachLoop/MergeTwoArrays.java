package day25_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,100, 200, 300, 400, 500, 600},
               arr2 = {5,6, 1000, 2000, 3000, 4000, 5000, 8000, 9000};

        int[] arr3 = new int[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2
        //{1,2,3,4,0,0}


        int j = 0; // for the index numbers of third array
        for (int i = 0; i < arr1.length ; i++) { // for arr1
            arr3[j++] = arr1[i]; // retrieves each element from arr1 and assigns to the indexes of arr3
        }


        for (int i = 0; i < arr2.length; i++) { // for arr2
            arr3[j++] = arr2[i]; // retrieves each element from arr2 and assigns to the indexes of arr3
        }


        System.out.println(Arrays.toString(arr3)  );

        /*
        int[] a1 = {1,2,3,4};
        String[] s1 = {"A", "B"};

        Object[] r = {"A", 1, 'C', true};
         */




    }

}

/*
2. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */
