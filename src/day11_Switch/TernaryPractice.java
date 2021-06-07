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





    }

}
