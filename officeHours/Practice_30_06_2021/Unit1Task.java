package Practice_30_06_2021;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Unit1Task {
    public static void main(String[] args) {
        /*
        CarComputer

						- Assume that ;

							- You live  Houston city in TX state.
							- You will go to a trip and you have 3 choice

								== Distance from Houston ==

									San Antonio   250 mil
									Dallas		  300 mil
									Austin.       200 mil

							- Unit Price Of Fuel is $ 3.06
							- Average Fuel Consumption is 3.2 gal/100 mil
							- Max speed is 80 mph
							- Min speed is 40 mph

						According to this information

							Ask the user :

						1. Do you want to start the car ? (as boolean)

							 	true : Continue trip
							 	false: Give a message " see you later "


						2.if user continues to trip

							 		Which city do you want to go ?  (as String)
										List of cities
											San Antonio
											Dallas
											Austin

								    According to user answer assign your distance related values.

								    If user input is out of this cities assign as distance 0

                        3.if user choose one of these city assign your speed  60 mph as default

                                	Then Give this info message for user (as int)

                                		to increase the speed press 0
										to decrease the speed press 1

							Option -1 ----- if user press 0

									Ask user "How much would you like to increase the speed?"

										If totalSpeed is bigger than maxspeed don't do any changes in speed
										otherwise you can change(increase) speed according to input

										Example :

											Default speed:60 mph
											User Input :30 mph

											output: "It is not allowed.Your speed is " + 60

											Default speed:60 mph
											User Input :15 mph

											output: "Your speed is increased!"+ 75

							Option -2 -----if user press 1

									Ask user "How much would you like to decrease the speed?"

										If totalSpeed is smaller than minSpeed don't do any changes in speed
										otherwise you can change(decrease) speed according to input

										Example :

											Default speed:60 mph
											User Input :30 mph

											output: "It is not allowed.Your speed is " + 60

											Default speed:60 mph
											User Input :15 mph

											output: "Your speed is decreased!"+ 45

							Option -3 -----if user press any number other than 0 or 1

										Give an info message

 											"Your speed is not changed!" + $speed

 									Ex : 	"Your speed is not changed!" + 60



 						3.According to all inputs print out this result

	 						EstimatedTime  		 : distance/speed

	 						TotalFuelConsumption : EstimatedTime*Average Fuel Consumption;

	 						TotalPriceForFuel	 : TotalFuelConsumption*Unit Price Of Fuel

						======= Example ========

						Inputs : true , San Antonio,1,10

		   								========== Results ===========
										Estimated Time         : 5.0
										Total Fuel Consumption : 16.0 gal
										Total Price Price      : $48.96


 							1-	Question :Do you want to start the car ? (as boolean)
								Answer   :true

							2-	Question : Which city do you want to go ? (as String)
												List of cities
													San Antonio
													Dallas
													Austin
								Answer   :	San Antonio

							3-	Question : If you want to increase the speed press 0   (as int)
										   if you want to decrease the speed press 1
								Answer.  : 		1
							4-	Question :  How much would you like to decrease the speed?(as int)
								Answer   :				10
								Info	 : Your speed is decreased! 50

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to start car ?");
        boolean isStart=input.nextBoolean();   // true -- false
        int distance=0;
        int speed=60;
        int maxSpeed=80;
        int minSpeed=40;
        /*
        - Unit Price Of Fuel is $ 3.06
							- Average Fuel Consumption is 3.2 gal/100 mil
         */
        double unitPriceForFuel=3.06;
        double averageFuelConsumpion=3.2;

        if (isStart){
            input.nextLine();
            System.out.println("Which city do you wanna go?\n\tList of Cities\n\t\tSan Antonio\n\t\tDallas\n\t\tAustin");
            String destination=input.nextLine();

            switch(destination){
                case "San Antonio":
                    distance=250;
                    break;
                case "Dallas":
                    distance=300;
                    break;
                case "Austin":
                    distance=200;
                    break;
                default:
                    distance=0;
                    break;

            }


            if(distance>0){
                speed=60;
                System.out.println(destination);
                System.out.println("To increase press 0\nTo decrease press 1");
                int speedRegulator=input.nextInt();

                switch(speedRegulator){
                    case 0:
                        System.out.println("How much would you like to increase the speed?");
                        int speedInc=input.nextInt();

                        if(speed+speedInc>maxSpeed){
                            System.out.println("It is not allowed.Your speed is " + speed);
                        }else
                        {
                           // speed=speed+speedInc;
                            speed+=speedInc;
                            System.out.println("our speed is increased!"+ speed);
                        }

                        break;
                    case 1:
                        System.out.println("How much would you like to decrease the speed?");
                        int speedDec=input.nextInt();

                        if(speed-speedDec<minSpeed){
                            System.out.println("It is not allowed.Your speed is " + speed);
                        }else
                        {
                            speed-=speedDec;
                            System.out.println("our speed is decreased!"+ speed);
                        }

                        break;
                    default:
                        System.out.println("Your speed is not changed!" + speed);
                        break;
                }

                System.out.println("========Result========");

                double estimatedTime=(double)distance/speed;
                System.out.println("estimatedTime = " + estimatedTime);

                double totalFuelConsumption=averageFuelConsumpion*estimatedTime;
                System.out.println("totalFuelConsumption = " + totalFuelConsumption);

                double totalPrice=totalFuelConsumption*unitPriceForFuel;
                System.out.println("totalPrice = " + totalPrice);


            }else
            {
                System.out.println("This location is not defined");
            }
        }else
        {
            System.out.println("See you later ");
        }




    }
}
