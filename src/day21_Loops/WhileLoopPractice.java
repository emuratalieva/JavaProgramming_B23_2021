package day21_Loops;

public class WhileLoopPractice {

    public static void main(String[] args) {
        String sentence = "Java java JAVA jAvA";
        //              "Java Java Java"
        //              "Java Java"
        //              "Java"
        //              ""

      //  String originalSentence = sentence;  // to keep the original sentence

        int countJava = 0; //1+1+1+1
        
        while(sentence.toLowerCase().contains("java")){
            countJava++;
            sentence = sentence.replaceFirst("Java", "");
        }

        System.out.println("countJava = " + countJava);
        


    }

}
