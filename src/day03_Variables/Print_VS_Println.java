package day03_Variables;

public class Print_VS_Println {

    public static void main(String[] args) {

        System.out.println("Hello Batch 23"); // appends new line after printing
        System.out.println("How are you today?");

        System.out.println("---------------------------------------------");

        System.out.print("Hello Batch 23"); // does not append new line
        System.out.print("How are you today?");// does not append new line

        System.out.println();
        System.out.println("----------------------------------------");

        System.out.println("JRE stands for Java Runtime Environment, JAVAC stands for Java Compiler, day02_PrintStatement.JDK stands for Java Development Kit, JVM stands for Java Vritual Machine");

        System.out.println("----------------------------------------");

        System.out.print("JRE stands for Java Runtime Environment, ");
        System.out.print("JAVAC stands for Java Compiler, ");
        System.out.print("day02_PrintStatement.JDK stands for Java Development Kit, ");
        System.out.println("JVM stands for Java Vritual Machine");

    }

}
