package day29_ReturnMethods;

public class WarmUpTasks {

    public static void main(String[] args) {

        posNegZero(-10);



    }


    public static void posNegZero(int number){

        if(number>0){
            System.out.println(number+" is positive number");
        }else if(number < 0){
            System.out.println(number+" is negative number");
        }else{
            System.out.println(number+" is zero");
        }

    }




}

/*
1. create a function that can check if the given integer is positive, negative or zero

	2. create a function that can print out the combination of two integer arrays

	3. create a function that can print out the full name of a person in regular format
	            ex:
	               fullName("cYbErTeK", "SCHOOL");

	                output:
	                    "Cybertek School"

	4. create a function that can print out the maximum number between two numbers

	5. create a function that can print out the array of integers in descending order


 */
