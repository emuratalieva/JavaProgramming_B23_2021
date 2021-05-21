package day03_Variables;

public class VariablePractice1 {

    public static void main(String[] args) {

        // double vs float

        System.out.println(0.5);
        double num1 = 0.5;
        float num2 = 0.5F;

        long num3 = 500;

        System.out.println("---------------------------");
        byte byteNumber =100;
        short shortNumber = byteNumber;

      //  byte byteNumber2 = shortNumber;  larger type cannot be assigned to smaller type

        int intNumber = 100;
        long longNumber = intNumber; // smaller primitivve type can be assigned to larger type

     //   int intNumber2 = longNumber; larger type cannot be assigned to smaller type

    }

}
