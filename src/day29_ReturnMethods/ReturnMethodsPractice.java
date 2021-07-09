package day29_ReturnMethods;

public class ReturnMethodsPractice {


    public static void main(String[] args) {
        // find max number between 10 & 20, then multiply it by 2

        System.out.println("-----------------------------------------------------");
        int[] numbers = {10, 5, 0, -1, 20, 8, 7};
        int max= numbers[0];
        int min =  numbers[0];

        for (int each : numbers) {
            max = max(each, max);
            min = min(each, min);
        }


        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-----------------------------------------------------");

        int[] nums = {200, 300, 500, 5, -1, 0, -100, 1000, 2000};
        int maximumNumber = maxNumberFormIntArray(nums);
        int minimumNumber = minNumberFormIntArray(nums);

        System.out.println("minimumNumber = " + minimumNumber);
        System.out.println("maximumNumber = " + maximumNumber);

        System.out.println(  maxNumberFormIntArray(nums)  );

        System.out.println( minNumberFormIntArray(nums)  );



    }

    public static int max(int a, int b){
       /*
        int max = 0;
        if(a > b){
            max = a;
        }else{
            max = b;
        }

       return max;
        */
        return  (a > b)? a : b;

    }

    public static int min(int a, int b){
        return (a<b) ? a : b ;
    }


    public static int maxNumberFormIntArray(int[] numbers){
        int max= numbers[0];
        for (int number : numbers) {
           max = max(max, number);
        }

        return max;
    }

    public static int minNumberFormIntArray(int[] numbers){
        int min= numbers[0];
        for (int number : numbers) {
           min = min(min, number);
        }

        return min;
    }



    /*
    create a return method that can return the maximum number from the array
    create a return method that can return the minimum number from the array
     */


}
