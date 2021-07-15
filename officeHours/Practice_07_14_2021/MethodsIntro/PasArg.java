package Practice_07_14_2021.MethodsIntro;

public class PasArg {
    public static void main(String[] args) {

        sum(5,4);
        // sum(5.5,4);  // Compiler Error

        System.out.println(sum1(5, 4));
    }

    public static void sum(int a,int b){
        System.out.println(a+b);
    }

    public static int sum1(int a,int b){

        return a+b;
    }
}
