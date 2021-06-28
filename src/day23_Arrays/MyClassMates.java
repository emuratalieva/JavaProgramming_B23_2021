package day23_Arrays;

public class MyClassMates {

    public static void main(String[] args) {

        // if we know what are the elements are
        String[] friends = {"Sabit", "Ahmet", "Tugba", "Beryl", "Zulal"}; // size is 5
        System.out.println("Size: " +  friends.length );

        for (int i= 0; i <= friends.length-1; i++){ //i: index numbers of the array
            System.out.println( friends[i] );
        }

        System.out.println("-------------------------------------------------");

        // if we dont know what are the  elements are but we do know how many elements we wanna store
        String[]  friends2 = new String[5]; // size 5
        System.out.println("Size: "+friends2.length);
        friends2[0] = "Dilem";
        friends2[1] = "Mohammed";
        friends2[2] = "Komiljon";
        friends2[3] = "Esraa";
        friends2[4] = "Kemal";
      //  friends2[5] = "Muhtar"; // Array's size is fixed

        for (int i = 0; i <= friends2.length-1 ; i++) {
            System.out.println(friends2[i]);
        }



    }


}
