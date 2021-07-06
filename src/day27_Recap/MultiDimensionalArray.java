package day27_Recap;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        //                    0           1          2
        String[] scrum1 = {"Komiljon", "Yuliang", "Merve", "Nadima"};
        //                  0          1
        String[] scrum2 = {"Sabir", "Tamara"};
        //                   0          1      2
        String[] scrum3 = {"Tugba", "Hilal", "Dilem"};


        String[][] scrumTeams = { scrum1, scrum2, scrum3 }; // length: 3
        //                          0        1        2

        System.out.println( Arrays.deepToString( scrumTeams ) );

        // {"Komiljon", "Yuliang", "Merve", "Nadima"};
        System.out.println(  Arrays.toString( scrumTeams[0] ) );

        //Tamara
        System.out.println( scrumTeams[1][1] );

        System.out.println("---------------------------");

        for (String[]  eachScrum   : scrumTeams){
            System.out.println( Arrays.toString(eachScrum));
        }

        System.out.println("-----------------------------------");
        for (String[]  eachScrum   : scrumTeams){
           for ( String eachMember : eachScrum){
               System.out.print(eachMember +" ");
           }
        }

        System.out.println("\n------------------------------------------");
        
        for (int i = 0; i < scrumTeams.length; i++){
            for(int j = 0;  j < scrumTeams[i].length; j++){
                System.out.print(scrumTeams[i][j]+" ");
            }
        }


        System.out.println("\n--------------------------------------------");
        int[] numbers = {1,2,3,4,5};  //{5,2,3,4,1}
        int temp = numbers[1]; //1

        numbers[1] = numbers[3]; //[5,2,3,4,5]

        numbers[3] = temp; //[5,2,3,4,1]

        System.out.println( Arrays.toString(numbers) );



    }

}
