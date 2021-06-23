package Practice_06_23_2021.ForLoops;

public class ForLoopIntro {
    public static void main(String[] args) {


        /*
        for(init;condition;iteraton)

        init      :    int i =0   // char a ='a'

        condition :    true // false

        iteration :    ınc / dec       i+=10   i++    i-=10  i--

         */

        //	Print out Cybertek's characters one by one
        int i=0;
        for (i = 0; i < 10; i++) {

            System.out.print(i);

        }

        System.out.println();
        System.out.println("Out of loop");
        System.out.println(i);

        String name="Cybertek School";    // length 15

        for (i = 0; i <name.length(); i++) {

            System.out.print(name.charAt(i));   // Cybe

        }


        System.out.println("========Reverse========");

        for (i = name.length()-1; i >=0; i--) {

            System.out.print(name.charAt(i));

        }

        // Continue - Break

        // print all consonants
            // Cybertek School


        System.out.println("Conconants pf name");

          for(i=0; i<name.length();i++){

              //charAt

              if(name.charAt(i)=='a'||
                      name.charAt(i)=='i'||
                      name.charAt(i)=='o'||
                      name.charAt(i)=='u'||
                      name.charAt(i)=='e'){
                  continue;    // skips this iteration
              }


                System.out.print(name.charAt(i));

          }


        // Cybertek School
        System.out.println("print out Cybertek");

        for(i=0; i<name.length();i++){

            //charAt

            if(name.charAt(i)==' '){
                break;   // exit the loop
            }


            System.out.print(name.charAt(i));

        }


    }
}
