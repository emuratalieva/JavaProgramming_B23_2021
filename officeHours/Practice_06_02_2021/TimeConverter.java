package Practice_06_02_2021;

public class TimeConverter {
    public static void main(String[] args) {
        /*
        2.Create class named "TimeConverter" and make a main method

						- Write a Java program to convert time from second to hours/min/sec format
						- Input Seconds : 3695


							Expected Output:
							inputSeconds is 3695
							1 hours 1 minutes 35 seconds

							How many sec we have ?

							60 Sec = 1 mn
							60 min = 1 hr
							60*60 = 3600 sec in 1 hr
         */

        int inputSeconds=3695;

        int hours,minutes,seconds;




        /*
        hours = inputSeconds/3600;    // hours = 1

                    // 95 /60  = 1
        minutes= (inputSeconds%3600)/60;      // 1

        seconds=inputSeconds%60;

        System.out.println(hours+" hours "+minutes+" minutes "+seconds+" seconds");
        */
        // int inputSeconds=3695


        hours = inputSeconds/3600; // 2


        // inputSeconds=inputSeconds%3600;   //  3695 sec    return us 95

        inputSeconds%=3600;   // 95

        minutes =inputSeconds/60;    // min = 1


        inputSeconds%=60;   // 35

        seconds=inputSeconds;

        System.out.println(hours+" hours "+minutes+" minutes "+seconds+" seconds");



    }
}
