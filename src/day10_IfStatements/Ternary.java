package day10_IfStatements;

public class Ternary {

    public static void main(String[] args) {
        int n = 100;
        String result = "";

        if(n %2 ==0){
            result = "Even";
        }else{
            result = "Odd";
        }

        System.out.println(result);

        System.out.println("-----------------------------------------");

        String result2 = (n %2 ==0)? "Even" : "Odd";

        System.out.println(result2);



    }

}
