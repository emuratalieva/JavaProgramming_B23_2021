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

        System.out.println("--------------------------------------------");

        printMaxNumber(20, 20);

        System.out.println("---------------------------------------");
        int[] array = {100, 200, 0, -1, 500, 30, 50};

        printInDescendingOrder(array);


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

    public static void printMaxNumber(int num1, int num2){

        System.out.println(    (num1 > num2 ? num1 : num2)  +" is maximum number"     );

    }

    public static void printInDescendingOrder(int[] arr){
        Arrays.sort(arr);    //{1,2,3,4}
        int[] result = new int[arr.length];  //{4,3,2,1}

        for (int i = arr.length-1, j =0 ;  i>=0 ; i--, j++){  // reversing the array
              result[j]= arr[i];
        }

        System.out.println( Arrays.toString(result));

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
