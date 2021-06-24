package day21_Loops;

public class Break_VS_Exit {

    public static void main(String[] args) {

        for(int i = 0; i < 5; ++i){ // i: 0,1,2,3,4

            if(i==3){
               // break; // exits the loop ONLY
                System.exit(0);
            }
            System.out.println("Cybertek School");

        }


        System.out.println("Batch 23");


    }

}
