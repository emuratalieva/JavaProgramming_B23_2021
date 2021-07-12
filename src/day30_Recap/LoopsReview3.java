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


        System.out.println("----------------------------------------");

        for(int j = 1; j<= 5; j++){
            for(int i=1; i <= 10; i++){
                System.out.print(i+ " ");
            }
            System.out.println();

        }

        System.out.println("----------------------------------------");

        String str = "aabcccd";



        for(int j = 0; j <= str.length()-1; j++){

            char ch = str.charAt(j);
            int frequency = 0;


            for(int i= 0; i<= str.length()-1 ; i++ ){ // find the frequency of one character
                if(str.charAt(i) == ch){  //
                    frequency++;
                }
            }

          //  System.out.println(ch +"-"+frequency);

            if(frequency ==1){
                System.out.print(ch);
            }


        }














    }


}
