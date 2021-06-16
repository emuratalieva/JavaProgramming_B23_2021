package Practice_06_16_2021.Scanner;

import java.util.Scanner;

public class CarpetShop {
    public static void main(String[] args) {
        /*
        2.CarpetShop

						- Ask the user which room do they need carpet? (String)
									List of Rooms
										Bedroom
										Kitchen

				            -> If the user gives other than these roomTypes ,  give an error message about "Invalid Room Type"

				        - Ask the user roomType dimensions (as meter and double)
				        		Kitchen is circle.Take radius from user
				        		Bedroom is square or Rectangle.Take lenght and width from user

				        - Ask the user to delivery address (String, multiple words)
				        - unitPriceForCarpet = 3.92
				        - totalcost = area*unitPriceForCarpet;

				        - Print in the following format:
				            Ex:
				                inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010

				                 "TotalCost for your carpet is 51.84 and it will be delivery 1300 Lamar St Houston TX 77010 in one week"
         */

        double area=0;
        double unitPrice=3.92;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please type one of them.\n\tList of Rooms\n1-Bedroom\n2-Kitchen");
        String roomType=scan.nextLine();

        switch(roomType.toLowerCase()){
            case "kitchen":
                System.out.println("Please enter radius :");
                double radius=scan.nextDouble();
                area=radius*radius*3.14;

                break;
            case "bedroom":
                System.out.println("Please enter length :");
                double length=scan.nextDouble();
                System.out.println("Please enter width :");
                double width=scan.nextDouble();
                area=length*width;
                break;
            default:
                System.out.println("Invalid Room Type");
                break;
        }

        if(area>0) {

            scan.nextLine();

            System.out.println("Please enter your delivery address : ");
            String address = scan.nextLine();

            double totalCost = area * unitPrice;
            System.out.println("TotalCost for your carpet is " + totalCost + " and it will be delivery " + address + " in one week");

        }

        scan.close();

    }
}
