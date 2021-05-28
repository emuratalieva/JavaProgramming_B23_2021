package day07_ShortHand_Relational;

public class SwipeTwoNumbers {

    public static void main(String[] args) {
        int a = 200;
        int b = 300;

        int c = a; // c= 200;

        a = b; // a = 300;
        b = c; // b = 200 ;

        System.out.println("a = " + a); // 300
        System.out.println("b = " + b); // 200

    }

}


/*
1. write a program that can swipe two variables' value by using a temporary variable
			ex:
				if a= 10, b=15

				output:
					a = 15
					b = 10
 */