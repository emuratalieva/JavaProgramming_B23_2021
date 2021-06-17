package Practice_06_16_2021.StringPractice;

public class StringIntro {
    public static void main(String[] args) {

        String s1="Java";
        String s2="Java";
        String s3="Java";
        String s4="JAVA";

        System.out.println("== operator");

        System.out.println(s1==s2); // true
        System.out.println(s1==s3); // true
        System.out.println(s1==s4); // false

        System.out.println("equals() method");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // false
        System.out.println(s1.equalsIgnoreCase(s4)); // true

        String a1=new String("Java");
        String a2=new String("Java");
        String a3=new String("JAVA");

        System.out.println("== operator");
        System.out.println(a1==a2); // false
        System.out.println(a1==a3); // false

        System.out.println("equals() method");
        System.out.println(a1.equals(a2)); // true
        System.out.println(a1.equals(a3)); // false
        System.out.println(a1.equalsIgnoreCase(a3)); // true



    }
}
