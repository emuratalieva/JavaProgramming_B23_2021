package day13_Scanner;

import java.util.Scanner;

public class ShippingInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number:");
        int buildingNum = scan.nextInt(); //7925

        scan.nextLine(); //clear the scanner: Enter
        // we will only use it if nextLine is place after other method of scanner

        System.out.println("Enter your steer address:");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name:");
        String city = scan.nextLine();

        System.out.println("Enter your state:");
        String state =  scan.next();

        System.out.println("Enter your zip code:");
        String zipCode = scan.next(); // 22012Enter

        scan.nextLine();  //clear the scanner: Enter

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        String shippingInfo = fullName+"\n"+buildingNum+" "+streetAddress+"\n"+city+", "+state+" "+zipCode;
        System.out.println(shippingInfo);




    }

}
/*
ShippingInfo
	ask the followings:
		1. Building Number (nextInt)
		2. Street Address (nextLine)
		3. City Name  (nextLine)
		4. State ( next )
		5. Zip Code (next)
		6. Full Name (nextLine)

	print the shipping info of the person

	Ex:
		Aysu Ahmadil
		7925 Jones Branch Drive
		Mclean, VA 22012

 */