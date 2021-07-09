package day29_ReturnMethods;

import java.util.Arrays;

public class Kahoot {

    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C'};

        for (char each : chars) { // A, B, C

            System.out.println(each); // A, B, C

            if(each == 'B'){
                continue;
            }


        }


        System.out.println("--------------------------------");

        long[] arr = new long[2];  //{0, 0}
        arr[0] = 5;
        arr[1] = 10; //{5, 10}

        arr = new long[4];  // {0, 0, 0, 0}
        arr[2] = 15;  // {0, 0, 15, 0}
        arr[3] = 20; // {0, 0, 15, 20}

        System.out.println(Arrays.toString(arr));


        System.out.println("---------------------------");
        int[] num1 = new int[3]; // size: 3,   {0,0,0}
        int[] num2 = {1,2,3,4,5}; // size: 5  {1,2,3,4,5}

        num1 = num2; // num1' size: 5 , {1,2,3,4,5}

        System.out.println(Arrays.toString(num1));






    }

}
