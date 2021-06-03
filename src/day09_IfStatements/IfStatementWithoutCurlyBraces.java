package day09_IfStatements;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {
         int number = 10;

         if(number%2 ==0)
             System.out.println("Even");
         else
             System.out.println("Odd");

        System.out.println("-----------------------------");

        if(number%2 ==0) {
            System.out.println("Even");
            System.out.println("Number");
        }else {
            System.out.println("Odd");
            System.out.println("Number");
        }





    }

}
