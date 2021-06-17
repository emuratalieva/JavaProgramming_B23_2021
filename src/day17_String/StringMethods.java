package day17_String;

public class StringMethods {

    public static void main(String[] args) {

        String sentence = "My favorite programming languages are: C#, Java, JavaScript";
        boolean hasPython = sentence.contains("Python");
        boolean hasJava = sentence.contains("java");
      //  boolean hasJava2 = sentence.toLowerCase().contains("java");

        System.out.println("hasPython = " + hasPython); // false
        System.out.println("hasJava = " + hasJava); //
    //    System.out.println("hasJava2 = " + hasJava2);

        System.out.println("--------------------------------------------");
        String sentence2 = "Cybertek School is the best";
        boolean startWithCybertek = sentence2.startsWith("Cybertek"); // true
        boolean startsWithSchool = sentence2.startsWith("School"); // false

        System.out.println("startWithCybertek = " + startWithCybertek);
        System.out.println("startsWithSchool = " + startsWithSchool);


        System.out.println("------------------------------------------");

        boolean endsWithBest = sentence2.endsWith( "best" );

        System.out.println("endsWithBest = " + endsWithBest);



    }

}
