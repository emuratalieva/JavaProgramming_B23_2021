package day18_Recap;

public class StringMethodsPractice {

    public static void main(String[] args) {
        String str = "abcd";
        int indexOfK = str.indexOf("k");
        System.out.println("indexOfK = " + indexOfK);

        if(indexOfK >= 0){
            System.out.println("The string has character k");
        }else{
            System.out.println("The string does not have k");
        }

        System.out.println("--------------------------------------");

        String sentence = "I like to learn C#, C# is cool J";
        // verify if the sentence has "Java"

        if(sentence.indexOf("Java") >=0){
            System.out.println("sentence has java");
        }else{
            System.out.println("sentence does not have java");
        }


        System.out.println("----------------------------------------");

        String sentence2 = "I love Java, C# is cool";
        //                         7     13
        boolean isUnique = sentence2.indexOf("Java")  == sentence2.lastIndexOf("Java");
                            //     7                  ==     7

        System.out.println("isUnique = " + isUnique);

        System.out.println("--------------------------------------------");

        String schoolName = "Cybertek School";
        String name = schoolName.substring(0, schoolName.indexOf(" ") );

        System.out.println("name = " + name);

        String sentence3 = "I live in California, I go to Cybertek school   ";
        String name2 = sentence3.substring( sentence3.indexOf("Cy"), sentence3.lastIndexOf(" school") ) ;

        System.out.println("name2 = " + name2);

        System.out.println("---------------------------------------------");

        String str2 = "Dog Cat Dog Cat";
        System.out.println(str2);
        str2 = str2.replace("Cat", "Dog"); //"Dog Dog Dog Dog"
        System.out.println(str2);

        str2 = str2.replaceFirst("Dog", "Cat");
        System.out.println( str2);

        String sentence4 = "Java Java Java";
     //  sentence4 = sentence4.replaceFirst("Java", "C#").replaceFirst("Java", "Python") ; // "C# Python Java"

    //    sentence4 =  sentence4.replace("Java Java ", "C# Python ");

        System.out.println(sentence4);

        System.out.println("-----------------------------------------------");

        System.out.println(  "Yes".equals("yes")  ); // false

        System.out.println( "Yes".equalsIgnoreCase("yes") ); // true

        System.out.println( "YES".equalsIgnoreCase("no") ); // false




    }


}
