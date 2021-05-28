package day07_ShortHand_Relational;

public class MarketGroups {

    public static void main(String[] args) {
        int score = 22;

        boolean earlyBird = score >= 50 ; // false
        boolean group1 =  score >= 40 && score <= 49; // false
                    //     false  &&  true ==> false

        boolean group2 = score >= 30 && score <= 39;
            //              false    && true  ==> false

        boolean angryBirds = score < 30; // true

        System.out.println("earlyBird = " + earlyBird);
        System.out.println("group1 = " + group1);
        System.out.println("group2 = " + group2);
        System.out.println("angryBirds = " + angryBirds);



        /*
        earlyBirds: 50 ~ 60
        group1: 40 ~49
        group2: 30 ~ 39
        angryBirds: < 30
         */



    }


}
