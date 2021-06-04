package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "James";
        int age =15;
        String citizen = "USA";

        boolean eligibleToVote =  age >= 21  && citizen == "USA";

        if(eligibleToVote){ // if the person is eligible
            System.out.println(name+" is eligible to vote");
        }


        if(!eligibleToVote){  // if the person is NOT eligible
            System.out.println(name+" is not eligible to vote");
        }


    }

}
