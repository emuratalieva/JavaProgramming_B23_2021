package day07_ShortHand_Relational;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "Conor McGregor";

        int age = 21;
        String citizen = "USA";
        int creditScore = 750;

        boolean eligibleToVote =   age >= 18  &&  citizen == "USA" && creditScore >= 700;
        //                          34 >= 18  &&   "UK" == "USA"
        //                           true  &&  false
        //                           false

        System.out.println(name+" is eligible to vote for Biden: "+eligibleToVote);

    }

}

/*
to Vote:
		1. MUST be US citizen
		2. at least 18 years old
		3. credit score must be at least 700

 */
