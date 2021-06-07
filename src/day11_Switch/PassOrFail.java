package day11_Switch;

public class PassOrFail {


    public static void main(String[] args) {

        char grade = 'Q';

        /*
        Pass:  A, B, C, D
        failed: f
         */

        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid Grade");
        }




    }

}
