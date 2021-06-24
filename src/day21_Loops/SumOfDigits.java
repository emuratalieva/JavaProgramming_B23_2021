package day21_Loops;

public class SumOfDigits {

    public static void main(String[] args) {
        String str = "A4B6C9";
        int sum = 0;

        //digits:  1   2   3
        //        49  50   51  = 150
        //       (49-48)  (50-48)  (51 - 48)


        for(int i = 0; i <= str.length()-1; i++ ){// i: each index numbers of str
            char each = str.charAt(i);
            if (each >= '0' && each <= '9'){
                sum +=  each - 48;  // in order to convert character digit to integer number
            }
        }


        System.out.println("sum = " + sum);







    }

}

/*
3. Write a program that can return the sum of digits froma  string
     		Ex:
     			input: A1B2C3

     			output: 6
 */
