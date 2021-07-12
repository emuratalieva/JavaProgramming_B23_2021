package day30_Recap;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] numbers =  {100, 200, 300, 400, 500};
        //                  0,  1,   2,   3,   4

        for(int  each  : numbers){
            System.out.println(each);
        }

        System.out.println("------------------------------");
        int max = numbers[0];
        int min = numbers[0];

        for(int number: numbers){
            /*
           if(number > max){
               max = number;
           }
             */

            max = Math.max(number, max); // returns the maximum number between two numbers
            min = Math.min(number, min);
        }


        System.out.println("max = " + max);


        System.out.println("--------------------------------------");

        System.out.println( Math.sqrt(4) );

        System.out.println(Math.pow(4,2));  // 16: 4*4

   //     System.out.println( Math.);

        System.out.println(Math.E);
        System.out.println(Math.PI);



    }


}
