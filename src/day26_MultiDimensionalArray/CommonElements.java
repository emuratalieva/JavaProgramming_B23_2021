package day26_MultiDimensionalArray;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        int[] arr2 = {4,5,6,7,8, 9, 10 , 11};

        for (int element : arr2) { // gets the elements of arr2
            for (int each : arr1) { // each: 1,2,3,4,5 .   gets the elements of arr1
                if (each == element) {
                    System.out.println(each);
                }
            }
        }

        System.out.println("-----------------------------------------");
        for (int i = 0; i < arr2.length; i++) { //i: indexes of arr2

            for (int j = 0; j < arr1.length; j++) {//j:  indexes of arr1
                if(arr2[i]  == arr1[j]) {
                    System.out.println(arr2[i]);

                }

            }
        }




    }

}

/*

Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

          solution 1:
              DO NOT use for each loop

          solution 2:
              MUST use for each loops

 */
