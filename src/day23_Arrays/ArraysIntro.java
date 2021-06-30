package day23_Arrays;

public class ArraysIntro {

    //DataType[] variableName = {data1, data2, data3 ...};
    public static void main(String[] args) {

        String[]  group1 = {"Feruza" , "Yuliang" , "Tamara", "Ahmet" };
        //          index:   0           1           2         3

        // retrieve data from array:
        System.out.println( group1[0] );
        System.out.println( group1[1] ); // Yuliang
        System.out.println( group1[2] ); // Tamara
        System.out.println( group1[3] );

        group1[1]="Mehmet";

        System.out.println("---------------------------------------------");

        for(int i=0; i <= 3; i++){
            System.out.println( group1[i] );
        }



    }

}
