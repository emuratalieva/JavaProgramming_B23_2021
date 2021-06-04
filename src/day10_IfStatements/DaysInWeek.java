package day10_IfStatements;

public class DaysInWeek {

    public static void main(String[] args) {
        int number = 5 ;  // 1 ~ 7
        String name = "";


        if(number == 1){
            name = "Monday";
        }else if(number == 2){
            name = "Tuesday";
        }else if(number == 3){
            name = "Wednesday";
        }else if(number ==4){
            name = "Thursday";
        }else if(number == 5){
            name = "Friday";
        }else if(number == 6){
            name = "Saturday";
        }else {
            name = "Sunday";
        }

        System.out.println("name = " + name);




    }


}
