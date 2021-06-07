package day11_Switch;

public class TernaryPractice {

    public static void main(String[] args) {
        /*
        1. Given two values: yearly salary and credit score determine if you can get a loan.
			    To be approve for the loan, print: "Loan Approved":
				        Salary: above 60,000
				        Credit Score: above 650
			    	Otherwise print: "Loan Denied"

			    	NOTE: MUST APPLY TERNARY
         */
        double salary = 90_000;
        int creditScore = 720;
        String result =  ( salary >= 60000 && creditScore >= 650) ? "Loan Approved" : "Loan Denied"  ;

        /*
        if( salary >= 60000 && creditScore >= 650){ //if the person is eligibel for loan
            result  = "Loan Approved";
        }else{ //if the person is not eligible for loan
            result = "Loan Denied";
        }
         */

        System.out.println("result = " + result);

        System.out.println("------------------------------------------------------------------");
        /*
        2. Given a sport you play at the community center you will have to pay some entrance fee.

				    Soccer or Tennis fee is: 100
				    Otherwise fee is: 50

				   NOTE: MUST APPLY TERNARY
         */

        String sport = "Golf";
        int price = (sport == "Soccer" || sport == "Tennis" ) ? 100 : 50 ;
        System.out.println("price = " + price);

        System.out.println("----------------------------------------------------------------");
        /*
        3. write a program that checks for the bigger of 3 numbers.
		you get 3 int variables with different values: n1 , n2 and n3
			if n1 is biggest output: "n1 is bigger"
			if n2 is biggest output: "n2 is bigger"
			if n3 is biggest output: "n3 is bigger"

			NOTE: MUST APPLY TERNARY
         */

        int n1 = 100,
                n2 = 500,
                n3 = 300;

        String result2 = (n1 > n2 && n1 > n3)?  n1+" is bigger"
                :(n2 > n1 && n2 >n3)? n2+" is bigger"
                : n3+" is bigger"  ;

        System.out.println("result2 = " + result2);

        System.out.println("-----------------------------------------------------------");
        int number = 12;
        String name = "";

        if(number >= 1 && number<= 12){

            name =   (number == 1)? "Jan" :(number==2)? "Feb" :(number == 3)? "Mar" :(number==4)?"Apr"
                    :(number==5)?"May" :(number==6)?"Jun" :(number==7)? "Jul" :(number==8)? "Aug"
                    :(number ==9)? "Sep" :(number==10)? "Oct" :(number==11)?"Nov" : "Dec";

            //   11 ? and 11 :

        }else{
            name = "Invalid";
        }




    }

}
