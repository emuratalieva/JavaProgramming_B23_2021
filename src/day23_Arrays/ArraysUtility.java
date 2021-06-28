package day23_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
        // toString
        int[] array = {1,2,3,4,5,6};

        System.out.println(array);

        System.out.println(  Arrays.toString(array)   );

        String[] array2 = new String[5];

        System.out.println(array2);

        System.out.println(  Arrays.toString(array2) );

        double[] nums = new double[5];

        System.out.println(Arrays.toString(nums));

        // sort(): sorts the elemnts of the array in ascending order

        String[] students = {"Boburbek", "Aysu", "Abbos", "Sabir"};

        System.out.println( Arrays.toString(students));

        Arrays.sort(students); // the array is sorted inascending order (a to z

        System.out.println( Arrays.toString(students));


        int[] numbers = {9,10,4,1,3,-1,0,1,2};
        System.out.println( Arrays.toString(numbers) );
        Arrays.sort(numbers);

        System.out.println( Arrays.toString(numbers) );
        System.out.println("Minimum number: "+numbers[0]);
        System.out.println("Maximum Number: "+numbers[numbers.length-1] );

        char[] chars = {'z', 'b',  'k', 'a', 'c', 'y',  'x'};
        System.out.println( Arrays.toString(chars) );

        Arrays.sort(chars);
        System.out.println( Arrays.toString(chars) );


        // equals(arr1, arr2)
        int[] num1 = {1,2,3};
        int[] num2 = {1,2,3};

        int[] num3 = {3,2,1};
        int[] num4 = {2,3,1};

        boolean r1 = Arrays.equals(num1, num2);
        boolean r2 = Arrays.equals(num2, num3);
        
        Arrays.sort(num3); // num3 will be in ascending order, {1,2,3}
        Arrays.sort(num4); // num4 will be in ascending order, {1,2,3}
        boolean r3 = Arrays.equals(num3, num4);
        
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        








    }

}
