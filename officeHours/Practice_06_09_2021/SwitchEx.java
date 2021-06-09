package Practice_06_09_2021;

public class SwitchEx {

    public static void main(String[] args) {



        /*

        boolean-float-double - long with switch


        switch(expression){


                case constant1 :       // No curly brackets

                    statements
                    .
                    ..
                    ...
                    break;            // All the case block stements are OPTIONAL including break.Black case is totaly legally code

               case constant2 :        // constant2 or constant3 or constant4    ||
               case constant3 :
               case constant4 :

                    statements
                    .
                    ..
                    ...

               default  :            // we can put this anywhere in switch statement

                    statements
                    .
                    ..
                    ...
                    break;


        }

         */


       /*
       1-Create  a program that accepts animal as String

							DOG 	- domestic animal
							CAT 	- domestic animal
							TIGER 	- wild  animal

							For other animal - unknown animal

							INPUT : DOG 		EXPECTED OUTPUT : DOG is domestic animal
        */

        String animal="MONKEY";
        String result="";
        switch(animal){

            case "DOG":
            case "CAT":
                result="Domestic Animal";
                break;
            case "TIGER":
                result="Wild Animal";
                break;
            default:
                result="Unknown Animal";
                break;
        }

        System.out.println("result = " + result);


    }
}
