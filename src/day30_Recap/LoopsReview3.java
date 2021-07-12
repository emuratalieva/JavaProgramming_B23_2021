package day30_Recap;

public class LoopsReview3 {

    public static void main(String[] args) {

        String sentence = "I love Java, Java is fun, Java Java Java";
        //                I love , Java is fun Java Java Java
        //                I love , is fun Java Java Java

        String word = "Java";
        int count = 0; // 1+1

        while(sentence.contains(word)){ // false: if the sentence does not contain teh word
           sentence =  sentence.replaceFirst(word, ""); //replaces the first matching word from sentence
           count++;
        }

        System.out.println(count);
        System.out.println( sentence);








    }


}
