package day28_Methods;

public class MethodsWithParameter {


    public static void main(String[] args) {

        eligible(30);

    }


    public static void eligible(int age){

        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

    }






}
