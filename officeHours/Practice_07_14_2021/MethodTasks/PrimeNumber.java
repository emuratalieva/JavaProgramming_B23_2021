package Practice_07_14_2021.MethodTasks;

public class PrimeNumber {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.print(isPrime(i)?i+" ":"");

        }

    }
    /*
    Task 1 :   Write a method that can check if a number is prime or not

				Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1


   10 -- 10 and 1 it is Prime     10 / 1-2-5-10
    7                             7  / 1-7              PrimeNumber
    13                            13/  1-13             PrimeNumber
    9                             9 /  1-3-9             it is not Prime
     */


    public static boolean isPrime(int number){

        if(number<2){
            return false;
        }

        for (int i = 2; i < number; i++) {
            if(number%i==0){
                return false;
            }
        }

        return true;


    }
}
