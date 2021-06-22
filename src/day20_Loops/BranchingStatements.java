package day20_Loops;

public class BranchingStatements {

    public static void main(String[] args) {

        for(int i = 0; i <= 5; i++){
            if(i==3){
                break; // exit the loop
            }

            System.out.println(i);

        }

        System.out.println("-----------------------------------------------");

        for(int i = 0; i <= 5; i++){

            if(i == 3){
                continue;  // skip
            }

            System.out.println(i);

        }

        System.out.println("--------------------------------------");
        // print the odd numbers between 1 ~ 10.  MUST use continue

        for (int i = 1; i < 11 ; i++) {

            if(i%2==0){ // if the i is even number
                continue; // skip
            }

            System.out.println(i);

        }


        System.out.println("-------------------------------------------");
        // print all the numbers between 1- 100 that are evenly divisible by 3 & 5

        for(int i = 1; i <= 100; i++){
            if(i % 15 !=0){
                continue;
            }
            System.out.print(i+" ");

        }

        System.out.println();

        System.out.println("-----------------------------------------------");
        // print all letters between A ~ Z, except for D, T, X

        for (char i ='A'; i <= 'Z'; i++){
            if(i == 'D' || i == 'T' || i == 'X'){
                continue; // skip
            }

            System.out.print(i+" ");
        }



    }

}
