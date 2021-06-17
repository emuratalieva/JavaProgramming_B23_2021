package Practice_06_16_2021.Scanner;

import java.util.Scanner;

public class EstimatedTimeCalculator {
    public static void main(String[] args) {
        /*
        1.EstimatedTimeCalculator

   							Assume that you have a plan to go from A to B point
   							maxSpeed=80
   							minSpeed=40

   							- Ask the User
   								- Car speed
   											should be 40 - 80 mph
   										-> if user enters smaller than minSpeed
   																or
   													 	   bigger than maxSpeed
   										-   assign for speed 60 as default
   										-   otherwise assign for speed userInput(int)

   								- startingpoint(string) and destination(string)
   								- distance between this two points(double)

   								According to this information calculate triptime;

   								Formula of estimatedTime = distance/speed;

   							   	Ex :

   										Inputs :50,San Antonio,Dallas,300

   										"The Estimated Time Of Arrival is 6.0 hours from San Antonio to Dallas "
         */


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your speed");
        int carSpeed=input.nextInt();

        if(carSpeed<40 || carSpeed>80){

            carSpeed=60;
            System.out.println("It is not allowed your speed is 60");
        }
        input.nextLine();

        System.out.println("Please enter starting point");
        String startingPoint=input.nextLine();

        System.out.println("Please enter destination point");
        String destination=input.nextLine();

        System.out.println("Please ante ryour distance between "+startingPoint+ " to "+ destination);
        double distance=input.nextDouble();

        double estimatedTime=distance/carSpeed;

        System.out.println("The Estimated Time Of Arrival is "+estimatedTime+" hours from "+startingPoint+" to "+destination);









    }
}
