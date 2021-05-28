package day07_ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {

        String name1 = "Muhtar";
        String name2 = "Mehmet";

        String name3 = name2; // name3 = "Mehmet"


        name2 = name1; //name2 = "Muhtar"
      //  name1 = name2; // name1 = "Muhtar"
        name1 = name3;  // name1 = "Mehmet"

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        System.out.println("-----------------------------------");
        int a = 200;
        System.out.println("a = " + a); // 200

        a = 100 + 300;
       
        System.out.println("a = " + a); // 400

        System.out.println("-----------------------------------");
        int balance =  300;
         //   balance = balance + 200;
        balance +=  200;
        System.out.println("balance = " + balance); // 500

        balance += 1000;
        System.out.println("balance = " + balance); // 1500

        String school = "Cybertek";
        school += " School";
        System.out.println("school = " + school);

        String name = "John";
        String lastName = "Daniel";
        name += " ";
        name +=  lastName;

        System.out.println("name = " + name);
        
        System.out.println("------------------------------------------");
        // withdraw:
        balance -= 300;
        System.out.println("balance = " + balance);

        balance -= 1000;
        System.out.println("balance = " + balance);
        




    }

}
