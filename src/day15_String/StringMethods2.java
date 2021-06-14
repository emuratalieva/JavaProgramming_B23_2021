package day15_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "Java Programming Language";
        //index:           0123
        String name = sentence.substring(0, 3+1);

        System.out.println(name);

        String s2 = "Cybertek School";
        //           0123456789

        String name2 = s2.substring(0, 8);
        System.out.println(name2);

        //String name3 = s2.substring(9, 15);
        String name3 = s2.substring(9);


        System.out.println("--------------------------------------------");
        String sentence2 = "Java is a programming language";

        String name4 = sentence2.substring(10);
        System.out.println(name4);

        String name5 = sentence2.substring(10, 20+1 );

        System.out.println(name5);



    }



}