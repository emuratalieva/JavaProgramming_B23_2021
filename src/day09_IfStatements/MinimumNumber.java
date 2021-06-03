package day09_IfStatements;

public class MinimumNumber {

    public static void main(String[] args) {
        int num1 =20, num2 = 30;

        if(num1 < num2){
            System.out.println(num1+" is minimum");
        }

        if(num2 < num1){
            System.out.println(num2+" is minimum");
        }

        System.out.println("--------------------------------------");

        if(num1 < num2){
            System.out.println(num1+" is minimum");
        }else{
            System.out.println(num2+" is minimum");
        }



    }

}

/*
 2. write a program that can print out the minimum number between two numbers

        Ex:
            num1 = 20;
            num2 = 30;

            output:
                20 is the minimum number
 */
