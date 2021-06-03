package day09_IfStatements;

public class DaysInMonth2 {

    public static void main(String[] args) {
        int month = 3;

        if(month == 2){
            System.out.println("28 days");
        }else if(month ==4 || month == 6 || month==9 || month==11){
            System.out.println("30 days");
        }else{
            System.out.println("31 days");
        }


    }

}
/*
 3. write a program that can find the number of days in a month (Assume that Feb has 28 days)
            Ex:
                month = 2

            output:
                    28 days

        Hints: you will need single if statements for:
            28 days: 2
            30 days: 4, 6, 9, 11
            31 days: 1, 3, 5, 7,8,10, 12
 */
