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




    }


}
