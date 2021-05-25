package day05_ArithmeticOperators;

public class BirthDay {

    public static void main(String[] args) {
        String name = "Tugba",
               birthMonth = "May";

        int birthDay = 16,
                birthYear = 1992;

        System.out.println(name+" was born on "+birthMonth+"/"+birthDay+"/"+birthYear+".");

        int age = 2021 - birthYear;
        System.out.println(name+" is "+age+" years old.");



    }
}

/*
3. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */
