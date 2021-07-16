package day33_Methods;

public class WarmUpTask3 {


    public static void main(String[] args) {
        int[] array = {1,1,1,2,3,3,4,5,5,6};  //{2, 4, 6}
        int[] result = {};

        for (int each : array) {


        }






    }



                                //{1,1,2,3} ,   1
    public static int frequency(int[] array, int element){
        int count = 0;

        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    public static int frequency(double[] array, double element){
        int count = 0;

        for (double each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    public static int frequency(String[] array, String element){
        int count = 0;

        for (String each : array) {
            if(each.equals( element ) ){
                count++;
            }
        }

        return count;
    }

    public static int frequency(char[] array, char element){
        int count = 0;

        for (char each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }






}
/*
Task3:
	    1. create method that accepts one integer array and one integer number and returns the frequency of the number
	                Ex:
	                    int[] array ={1,1,1,1,1,2,2};

	                    frequency(array, 2) ==> 5

	    2. create method that accepts one double array and one double number and returns the frequency of the number


	    3. create method that accepts one String array and one String and returns the frequency of the String
	            Ex:
	                String[] array = {"Apple", "Apple", "Apple", "Orange"}

	                frequency(array, "Orange") ==> 1

	    4. create method that accepts one char array and a char and returns the frequency of the char
 */