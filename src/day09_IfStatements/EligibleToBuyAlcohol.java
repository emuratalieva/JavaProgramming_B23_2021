package day09_IfStatements;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {
        int age = 30;

        if(age >= 21){
            System.out.println("Eligible");
        }else{  // otherwise: age < 21
            System.out.println("Not Eligible");
        }


    }

}
