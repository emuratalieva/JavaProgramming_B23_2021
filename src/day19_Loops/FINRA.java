package day19_Loops;

public class FINRA {

    public static void main(String[] args) {
        String result = ""; //1 2 FIN ....

        for (int i = 1; i <= 100 ; i++) {

           // result += (i % 15 == 0 )? "FINRA " :(i % 3 == 0) ? "FIN " :(i%5 ==0)?"RA ": i+" ";

            if (i % 15 == 0 ){
               result += "FINRA ";
            }else if(i % 3 == 0){
                result += "FIN ";
            }else if(i%5 ==0){
                result += "RA ";
            }else{
               result += i+" ";
            }

        }

        System.out.println(result);


    }

}

/*
1. Write a method which prints out the numbers from 1 to 100 butfor numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....
 */