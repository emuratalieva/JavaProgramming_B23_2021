package day16_String;

public class StringMethods {

    public static void main(String[] args) {
        String email = "Cybertek@yahoo.com";
        email = email.replace("yahoo", "gmail"); //"Cybertek@gmail.com"

        System.out.println(email);

        String sentence = "C# is cool, C# is fun";
        //sentence = sentence.replace("C#", "Java"); // replaces all the matching
        sentence = sentence.replaceFirst(", C#", ", Java"); // replaces the first matching only

        System.out.println(sentence);

        String s = "Cat Dog Cat Dog Cat";
       // s = s.replace("Cat", "Dog");
      //  s= s.replaceFirst("Cat", "Dog");

        System.out.println(s);

        System.out.println("-----------------------------------------");
        String sentence2 = "Java is a cool language";
        //      index:      0123456789
        int indexOfFirstA = sentence2.indexOf("a");
        int indexOfSecondA = sentence2.indexOf("a ");
        int indexOfThirdA = sentence2.indexOf("a c")  ;
        int indexOfFourthA = sentence2.indexOf("an");
       // int indexOfFifthA = sentence2.indexOf("ag");
        int indexOfFifthA = sentence2.lastIndexOf("a");

        System.out.println("indexOfFirstA = " + indexOfFirstA);
        System.out.println("indexOfSecondA = " + indexOfSecondA);
        System.out.println("indexOfThirdA = " + indexOfThirdA);
        System.out.println("indexOfFourthA = " + indexOfFourthA);
        System.out.println("indexOfFifthA = " + indexOfFifthA);







    }

}
