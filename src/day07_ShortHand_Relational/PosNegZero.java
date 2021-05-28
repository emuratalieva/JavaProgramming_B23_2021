package day07_ShortHand_Relational;

public class PosNegZero {


    public static void main(String[] args) {
        int number = -100;

        boolean isPositive =  number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        //boolean isZero = isNegative == false  &&  isPositive == false;
        //boolean isPositive =  isNegative == false && isZero == false;

        System.out.println(number+" is a positive number: "+ isPositive);
        System.out.println(number+" is a negative number: " +isNegative);
        System.out.println(number +" is zero: "+isZero);




    }


}

/*
4. PosNegZero
			write a program that can check if a number is Positive, negative or zero

				Ex:
					number = 100;

				    output:
				    	100 is positive number: true
				    	100 is negative number: false
				    	100 is zero: false
 */
