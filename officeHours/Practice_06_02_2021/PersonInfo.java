package Practice_06_02_2021;

public class PersonInfo {

    public static void main(String[] args) {
        //  Single commnets



        /*

        Primitive
                - Integer --- byte < short < int < long
                - Floating -- float < double
                - Character -- char
                - Boolean  --- boolean



        Object

         */



        // First
        String name="Mehmet";

        // Second
        String name1;

        name1="Mehmet";

        // Third

        String name2, surname;
        name2="Mehmet";
        surname="Cybertek";

 /*
            Multi Lİne comments
            Task02:   Variables(Primitives - Non Primitives ),Concatenation and Escape Sequences

					  Create class named "PersonInfo" and make a main method

						    Create variables and give value related to you:

						        - String name
						        - byte age
						        - char gender
						        - boolean student
						        - short number of siblings
						        - long favorite number
						        - int number of seasons in your area
						        - double birth date: (month.day)
						        - int year
						        - String full birthday date with year
						        - String favorite quote
						        - Print the person information with using concat/escape characters
         */


            String name4 = "Mehmet";
            byte age = 40;
            char gender='M';
            boolean isStudent=false;
            short numberOfSiblings=3;
            long favoriteNumber=5;
            int numberOfSeasons=4, year =1980;
            double birthDate=06.17;
            String fullBirthDay= ""+birthDate+"."+year;
            System.out.println("fullBirthDay = " + fullBirthDay);

            // 6.17.1980

        String favoriteQuote="Never give up ";

        System.out.println("name  : " +name4);
        System.out.println("name :"+name4);
        System.out.println("name4 = " + name4);
        System.out.println("name4 = " + name4);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("isStudent = " + isStudent);
        System.out.println("numberOfSiblings = " + numberOfSiblings);
        System.out.println("favoriteNumber = " + favoriteNumber);
        System.out.println("numberOfSeasons = " + numberOfSeasons);

        // Escape Seq
        System.out.println("=========Escape Seq==========");

        System.out.println("\tname :"+name4 +"\n\tage :"+age+"\n\tgender :"+gender);
    }
}
