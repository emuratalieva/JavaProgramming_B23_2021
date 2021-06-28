package day23_Arrays;

public class HighestAndLowestScores {

    public static void main(String[] args) {

        int[] scores = {85, 70, 95, 90, 100, 110, 55};
        //              0,  1,  2,  3,  4

        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy", "Ahmet", "Muhtar"};

        int maxScore = scores[0];
        String maxName= "";

        int minScore = scores[0];
        String minName = "";

        for (int i=0; i <= names.length-1; i++ ){
            String eachName = names[i]; // gets each names from the array names
            int eachScore = scores[i]; // gets each score from the array scores

            if(eachScore > maxScore ){ // used for comparing the scores to assign the maximum score to maxScore
                maxScore = eachScore;
                maxName = eachName;
            }

            if(eachScore < minScore){ // used for comparing the scores to assign the miximum score to minScore
                minScore = eachScore;
                minName = eachName;
            }
        }

        System.out.println(maxName +" : "+maxScore);
        System.out.println(minName+" : "+minScore);


    }


}
