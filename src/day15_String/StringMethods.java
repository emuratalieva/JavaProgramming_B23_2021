package day15_String;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Muhtar";

        char ch1 = str.charAt(0);

        System.out.println("ch1 = " + ch1);

        String word = "Cybertek School";
        //index:       0123456789...
        char ch2 = word.charAt(9);
        System.out.println("ch2 = " + ch2);

        String word2 = "Java";
        //index:        0123
        char ch3 = word2.charAt(2);
        System.out.println("ch3 = " + ch3);

        System.out.println("-----------------------------------");
        String sentence = "Hello everyone, how are you all today?";
        int totalNumberOfChars = sentence.length();
        System.out.println("totalNumberOfChars = " + totalNumberOfChars);

        // chars:    8
        String s1 = "Cybertek";
        //index:     01234567
        int lastIndex = s1.length()-1; //in order to get the last index number we need to subtract one from the length of String
        char firstCharacter = s1.charAt(0);
       // char lastCharacter = s1.charAt(7);
        char lastCharacter = s1.charAt( lastIndex  );

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("----------------------------------");
        String firstName = "John";
        String lastName = "King";

        String fullName = firstName + " "  + lastName;
     //   String fullName2 = firstName.concat(" ").concat(lastName);


        System.out.println("--------------------------------------");
        String s = "cybertek";
         s = s.toUpperCase(); // "CYBERTEK"

        System.out.println(s);

        System.out.println("--------------------------------------");
        String s2 = "JAVA PROGRAMMING LANGUAGE";
        s2 = s2.toLowerCase(); // "java programming language"

        System.out.println(s2);

        String name = "muhtar";
                name = name.toUpperCase(); //"MUHTAR"

        System.out.println(name);

                name =name.toLowerCase();  // "muhtar"

        System.out.println(name);


        System.out.println("------------------------------------");
        String schoolName = "                      Cybertek  School                    ";
         schoolName = schoolName.trim(); // "Cybertek School"

        System.out.println(schoolName);






    }

}
