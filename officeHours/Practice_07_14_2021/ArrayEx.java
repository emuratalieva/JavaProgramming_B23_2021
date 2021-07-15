package Practice_07_14_2021;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] myArray=new int[3];
        myArray[0]=4;
        // System.out.println("Arrays.toString(myArray) = " + Arrays.toString(myArray));

        int[] anotherOne=myArray;
        anotherOne[0]=9;
        System.out.println("Arrays.toString(anotherOne) = " + Arrays.toString(anotherOne));
        System.out.println("Arrays.toString(myArray) = " + Arrays.toString(myArray));

    }
}
