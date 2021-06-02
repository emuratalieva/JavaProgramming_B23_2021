package Practice_02_06_2021;

public class CastingPractice {
    public static void main(String[] args) {

        /*
            byte < short <int <long <float <double

            TYPE CASTING

            1- IMPLICIT CASTING

                double a =5;

                - Done BY Compiler
                - Smaller type to bigger type
                - No loss data

            2- EXPLICIT CASTING

                 double b=5.3;
                 int i=b;

                - Done By Developer
                - Bigger type to smaller type
                - We can loss data


         */

        // byte to short
        byte b=10;
        short s=b;   // Implicit casting

        // double to int

        double a=5.3;
        int i=(int)a;   // Explicit
        System.out.println(i); // 5
        a=i;   // Implicit        a = 5

        // long to int

        long l=9999999999l;
        int ii= (int)l;   // Explicit Casting
        System.out.println("ii : "+ ii);



    }
}
