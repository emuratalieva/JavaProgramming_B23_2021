package day29_ReturnMethods;

import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {

        posNegZero(-10);

        System.out.println("-----------------------------------");

        int[] numbers = {10, 20, 0, -30, -5};

        for (int number : numbers) { // 10, 20, 0, -30, -5
            posNegZero(number);
        }

        System.out.println("---------------------------------------");
        int[] array1 = {1,2,3,4},
                array2 = {5,6,7,8,9,10};

        mergeTwoArrays(array1, array2);

        int[] arr1 ={100,200,300,400},
                arr2 = {1000, 2000, 4000};

        mergeTwoArrays(arr1, arr2);


        System.out.println("------------------------------------------");

        formatFullName("cyBERtek", "scHooL");


    }


    public static void posNegZero(int number){

        if(number>0){
            System.out.println(number+" is positive number");
        }else if(number < 0){
            System.out.println(number+" is negative number");
        }else{
            System.out.println(number+" is zero");
        }

    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;
        for (int each : arr1) {
           arr3[i++] = each;
        }

        for (int each : arr2) {
            arr3[i++] = each;
        }

        System.out.println(Arrays.toString(arr3));

    }

    public static void formatFullName(String firstName, String lastname){

       firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
       lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1).toLowerCase();

       String fullName = firstName +" "+lastname;

        System.out.println("fullName = " + fullName);

    }


}

/*
1. create a function that can check if the given integer is positive, negative or zero

	2. create a function that can print out the combination of two integer arrays

	3. create a function that can print out the full name of a person in regular format
	            ex:
	               fullName("cYbErTeK", "SCHOOL");

	                output:
	                    "Cybertek School"

	4. create a function that can print out the maximum number between two numbers

	5. create a function that can print out the array of integers in descending order


 */
