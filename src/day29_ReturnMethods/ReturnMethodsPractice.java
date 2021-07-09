package day29_ReturnMethods;

public class ReturnMethodsPractice {


    public static void main(String[] args) {
        // find max number between 10 & 20, then multiply it by 2
      int max =   max(10, 20);

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

    /*
    create a return method that can return the maximum number from the array
    create a return method that can return the minimum number from the array
     */


}
