package Practice_06_02_2021;

public class Relational_Unary_Shortand_Operators {
    public static void main(String[] args) {
        // Declaration
        boolean cond=true;
        int a=10,b=10;

        System.out.println("====== Data ======");
        System.out.println("cond = " + cond);  // true
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        System.out.println("====== Unary Operators  ======");

        System.out.println("cond = " + !!cond);  // true

        // pre and post ınc
        // int a=10,b=10;

        System.out.println("a++ :"+ a++);  // 10  post inc
        System.out.println(a);
        System.out.println(++b);   // memory = 11 print =11


        // a= 11     b= 11
        // pre and post dec
        System.out.println(--a);  //
        // a     print=10   memory =10
        System.out.println(b--);  //
        // b     print=11   memory =10

        System.out.println("====== Relational Operators  ======");
        // a= 10     b= 10

        System.out.println(a>--b);   // true
        // a= 10     b= 9
        System.out.println(a>=b);     //  true
        System.out.println(a<b);      // false
        System.out.println(a<=++b);     // true
        // a= 10     b= 10
        System.out.println(a==b);    // true
        System.out.println(a!=--b);  //  true
        // a= 10     b= 9

        System.out.println("====== Shortand Operators  ======");
        // a =a+b;
        a+=b;
        System.out.println(a);
        //a=a-b;
        a-=b;
        System.out.println(a);

        String name="Cybertek";

        //name=name+" School";
        name+=" School";


        System.out.println("name = " + name);


    }
}
