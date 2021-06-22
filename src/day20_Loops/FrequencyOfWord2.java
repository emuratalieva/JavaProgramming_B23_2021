package day20_Loops;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String sentence = "I love books, I purchased a lot of books books books books books books books"; // "C#"
        String word= "book";

        int count = 0;

        for(int i =0; i <= sentence.length()- word.length(); i++){
              String each = sentence.substring(i, i+word.length());
             if(each.equals(word)){ // if the word python is occured ,
                 count++;  // increase the count by 1
             }
        }

        System.out.println("count = " + count);


    }
}
