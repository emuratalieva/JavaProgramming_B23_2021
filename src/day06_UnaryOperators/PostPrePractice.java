package day06_UnaryOperators;

public class PostPrePractice {


    public static void main(String[] args) {
        int a = 1; //a=1-1=0+1=1-1=0-1 =-1
        a =  -a--  +  a++  /  -a--   *  --a;
        //   -1   +   0   /   -1     *  -1
        // -1 +  0  * -1
        // -1 + 0
        // -1


        System.out.println("a = " + a);



        int x = 10; // x=10+1=11-1=10+1 = 11-1 = 10
        x = ++x  -  x--  +   x++  +  --x;
        //  11  -   11   +   10   +  10
       //x = 0 + 10 + 10
       //x = 10 + 10
       //x = 20

        System.out.println("x = " + x);


        int y = 50; // y=50+1=51-1=50+1=51-1=50
        int z = -y++  + --y  -  ++y  +  y--;
        //  z = -50  +  50   -  51   +  51
        //  z = 0 - 51 + 51
        //  z = -51 +51
        //  z=0

        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("-------------------");
        int p = 100;
        System.out.println(++p); // 101

        int r = 100;
        System.out.println(r++); // 100

        System.out.println("p = " + p);
        System.out.println("r = " + r);

    }


}
