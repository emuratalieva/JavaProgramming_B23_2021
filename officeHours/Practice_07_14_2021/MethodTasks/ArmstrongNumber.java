package Practice_07_14_2021.MethodTasks;

public class ArmstrongNumber {
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            System.out.print(isArmstrong(i)?i+" ":"");

        }

    }
    /*
	Task 2 :   Write a method that can check if a number is Armstrong number
				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number.
				If the number obtained equals the original number then, we call that armstrong number.
				Armstrong numbers are     === 153 370 371 407 === for 3 digits
                153   ==  (1*1*1)+(5*5*5)+(3*3*3)  == 153
			                1       125      27
			    3        153%10  = 3        153/10= 15
			    5        15%10   = 5        15/10 = 1
			    1        1%10    = 1         1/10 = 0
     */

    public static boolean isArmstrong(int number){

        int lastDigit=0;
        int totalOfDigits=0;
        int originalNumber=number;

        if(number<2){
            return false;
        }

        while(number>0){
            lastDigit=number%10;   //3   5   1
            number/=10;            //15  1   0    number=number/10 ;
            totalOfDigits+=lastDigit*lastDigit*lastDigit;   // 27+125 +1 ==153
            // totalOfDigits+=Math.pow(lastDigit,3);
        } // number 0

        if(totalOfDigits==originalNumber){
            return true;}

        return false;



    }


}
