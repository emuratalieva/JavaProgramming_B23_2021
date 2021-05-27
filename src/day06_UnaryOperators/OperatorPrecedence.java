package day06_UnaryOperators;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println("Addition: " + 2 + 3);
        //                "Addition: 2" + 3
        //                "Addition: 2" + 3

        System.out.println("Addition: " +  (2 + 3) );

        System.out.println("------------------------------------");
        int a = 10;
        int b = 2;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " +  (a - b) );
        System.out.println("Multiplication: " +  a * b );
        System.out.println("Division: " + a / b);
        System.out.println("Remainder: " + a % b);




    }
}
