package day21_Loops;

public class WhileLoopPractice {

    public static void main(String[] args) {
        String sentence = "Java Java Java Java";
        //              "Java Java Java"
        //              "Java Java"
        //              "Java"
        //              ""

        int countJava = 0; //1+1+1+1
        
        while(sentence.contains("Java")){
            countJava++;
            sentence = sentence.replaceFirst("Java", "");
        }

        System.out.println("countJava = " + countJava);
        


    }

}
