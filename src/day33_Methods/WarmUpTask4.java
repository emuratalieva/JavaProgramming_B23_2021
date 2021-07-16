package day33_Methods;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTask4 {

    public static void main(String[] args) {
        String str = "aaabbbbbcc";  //"abc"
        String result = ""; //"abc"

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains( ""+each)){
                result += each;
            }
        }


        System.out.println(result);

        System.out.println("--------------------------------------------------------");
        int[] array = {1,1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5,5};  //{1,2,3,4,5}

        int[] newArr = {}; //1 1

        for (int each : array) {
            if( ! ArraysUtility.contains(newArr, each)){ // if the element is not contained in newArr
                 newArr = ArraysUtility.addElement(newArr, each ); // then add the element to the array
            }
        }


        System.out.println(Arrays.toString(newArr));

        System.out.println("-------------------------------------------");






    }

    public static int[] removeDup(int[] array){
        int[] newArr = {};

        for (int each : array) {
            if( !ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each );
            }
        }

        return newArr;
    }




}

/*
Task4:
	    1. create a method that can remove the duplicates from an array of integer
	        Ex:
	          int[] array = {1,1,1,2,2,2,3,4,5,5,5};
	          removeDup(array);  ===> {1,2,3,4,5}

	    2. create a method that can remove the duplicates from an array of double

	    3. create a method that can remove the duplicates from an array of String

	    4. create a method that can remove the duplicates from an array of char

	        HINT: how did you remove the duplicates from a string?

 */