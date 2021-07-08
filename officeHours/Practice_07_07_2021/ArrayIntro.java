package Practice_07_07_2021;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String[] color={"Yellow","Blue","Purple"};
        //                 0       1       2

        // retrieve


        System.out.println(color[0]);

        System.out.println("=================");


        int[] num=new int[4];   // 4 means is length

        num[0]=4;
        num[1]=3;
        num[2]=2;
        num[3]=1;


        // Arrays methods

        // equals

        int[] num1= {1,2,3,4};


        System.out.println("Arrays.equals(num,num1) = " + Arrays.equals(num, num1));


        // sort
        Arrays.sort(num);
        System.out.println("Arrays.equals(num,num1) = " + Arrays.equals(num, num1));

        // toString
        System.out.println("Arrays.toString(num1) = " + Arrays.toString(num1));


        // String methods

        // toCharArray

        String a="Cybertek";

        char[] chars = a.toCharArray();

        System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));

        // split

        String[] split = a.split("");

        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));




        //
        String b="abcabcabc";

        String[] abcs = b.split("abc");

        System.out.println(Arrays.toString(abcs));

        System.out.println(abcs.length);


    }
}
