package day07_ShortHand_Relational;

public class UnaryPractice {

    public static void main(String[] args) {
        int a = 100; //a=100+1=101+1=102-1=101-1=100
        
        int b = -a++ +  ++a  - a-- * a-- % 2;
        //  b = -100 +  102  - 102 * 101 % 2
        //  b = -100 + 102 - 10302 % 2
        //  b = -100 + 102 - 0
        //  b = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        
        int c = 10;
        System.out.println(c--); //10, c=9
        System.out.println("c = " + c);
        

    }

}

/*
2. manually calculate the following code fragements:

                1. int a = 100;
                   int b = -a++ + ++a - a-- * a-- % 2
 */