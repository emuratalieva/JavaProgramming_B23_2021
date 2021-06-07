package day11_Switch;

public class SwitchStatement {

    public static void main(String[] args) {
       int  number = 5;

        switch (number){   // 10, 10L. 0.5, 0.5d, 0.5F
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break; // case closed

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("No Such A Day");

        }



    }


}
