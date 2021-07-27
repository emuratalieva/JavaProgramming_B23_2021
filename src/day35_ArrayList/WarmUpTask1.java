package day35_ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUpTask1 {

    public static void main(String[] args) {

        LocalDate[] dates = new LocalDate[10];

        for (int i = 0; i < dates.length ; i++) {
            dates[i] = LocalDate.now().plusDays(i+1);
        }

        System.out.println(Arrays.toString(dates) );

        for(LocalDate each  : dates ){
            System.out.println(each.format( DateTimeFormatter.ofPattern("MMMM/dd/yy, EEEE")) );
        }






    }
}
