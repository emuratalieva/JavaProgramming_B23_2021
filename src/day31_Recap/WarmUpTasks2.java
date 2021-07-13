package day31_Recap;

public class WarmUpTasks2 {

    public static void main(String[] args) {

        String sentence = "Java java JaVA";
        String word = "java";

        int count = 0;  //3
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while(sentence.contains(word)){
           sentence =  sentence.replaceFirst(word , "");
           count++;
        }


        System.out.println(count);


        System.out.println("---------------------------------");
        String sentence2 = "Cybertek cybertek CYBerTeK, CYBERTEK";
        String word2 = "cybertek";

        int n2 = frequencyOfWord(sentence2, word2);

        System.out.println(n2);


    }


    public static int frequencyOfWord(String sentence, String word){
        int count = 0;  //3
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while(sentence.contains(word)){
            sentence =  sentence.replaceFirst(word , "");
            count++;
        }

        return count;
    }





}
