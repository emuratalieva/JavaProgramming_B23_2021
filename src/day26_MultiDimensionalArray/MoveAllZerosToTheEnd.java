package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {

      //  int[] array = {0,0,0,0,0,0,0, 10, 0, 5, 0, 1, 0,100, 200, 300, 0, 0, 0, 50, 52, 30, 11};
        int[] array = {10, 0, 5, 0, 1, 0};

        int[] result = new int[array.length]; //[0, 0, 0, 0, 0, 0]
                //{10, 5, 1, 0, 0, 0}

        for (int i = 0, j =0; i < array.length; i++) {
            if( array[i] != 0  ){ //10  5  1
                result[j] = array[i];
                j++; // after initializing the index, go to the next index
            }

        }


        /*
        int  i =0; // index number of the array result
        for (int each : array) { //each: 10, 0, 5, 0, 1, 0
            if(each != 0){ //10, 5, 1
                result[i] = each;
                i++;
            }

        }

         */

        System.out.println(Arrays.toString(result));


    }


}

/*
write a program that can mobve all the zeros to the end of the array
		Ex:
			array = {10, 0, 5, 0, 1, 0};

			output:
				{10, 5, 1, 0, 0, 0}
 */
