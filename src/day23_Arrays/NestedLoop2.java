package day23_Arrays;

public class NestedLoop2 {

    public static void main(String[] args) {

        for(int j = 1; j <= 6; j++){

            for (int i = 0; i < 20; i++) { //********************
                System.out.print("*");
            }
            System.out.println(); // appends new line after printing each 20 *

        }

        System.out.println("----------------------------------------");

        for(int j = 1; j <= 8; j++){ // j: number of lines

            for(int i = 1; i <= j ; i++){  // i: number of * in each line
                System.out.print("*");
            }

            System.out.println();

        }





    }


}

/*
 ********************
 ********************
 ********************
 ********************
 ********************
 ********************


 *
 **
 ***
 ****
 *****
 ******
 *******
 ********

 */