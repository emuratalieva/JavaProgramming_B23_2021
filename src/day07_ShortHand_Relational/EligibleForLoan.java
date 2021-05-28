package day07_ShortHand_Relational;

public class EligibleForLoan {

    public static void main(String[] args) {
        String name = "Randy";
        int age = 49;
        int workHistory = 0;
        int creditScore = 0;
        double income = 100000;


        boolean isEligible =  age >= 18  && workHistory >= 2 && creditScore >= 700 && income >= 60000;
        //                    49 >= 18   &&   7    >=  2     &&   760   >=  700   &&  75000  >= 60000
        //                    true      &&     true          &&      true         &&  true
        //                     true


        /*
        boolean r1 = income >= 60000  && workHistory >= 2;
        boolean r2 = age >= 18  && creditScore >= 700;
        boolean isEligible = r1 && r2;
        */


       // boolean r3 = age >= 18 && creditScore >= 700  && ( workHistory>= 2 || income >= 6000);






// in order to be eligible for load age must be at least 18 years old AND work history at be 2 years ANd...

        System.out.println(name +" is eligible for loan: "+isEligible);




    }

}

/*
3. EligibleForLoan
			income has to be at least 60k
			at least have 2 years of work history
			at least have 700 of credit score
			at least 18 years old

		variables:	name, age, workHistory, creditScore, income
 */