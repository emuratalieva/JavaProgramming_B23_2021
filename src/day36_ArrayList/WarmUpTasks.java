package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9) );
        System.out.println(list);
        list.set(list.size()-1,0);
        System.out.println(list);

        System.out.println("================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i)%2 != 0){
                list2.set(i, list2.get(i)*2 );
            }
        }
        System.out.println(list2);

        System.out.println("==================================");

        String[] arr1 = {"A", "B", "C"},
                arr2 = {"D", "E", "F", "G"};

        ArrayList<String> result = new ArrayList<>(  Arrays.asList( arr1 ) );
        result.addAll( Arrays.asList(arr2));

        /*
        for(String each : arr1){
            result.add(each);
        }
        for(String each : arr2){
            result.add(each);
        }
         */

        System.out.println(result);


        System.out.println("--------------------------------------");
        int[] numbers = {1,2,3,4,5,6,7};
        ArrayList<Integer> list4 = new ArrayList<>();
        // list4.addAll( Arrays.asList(numbers) );

        for (int each : numbers) {
            list4.add(each);
        }

        System.out.println(list4);




    }
}
