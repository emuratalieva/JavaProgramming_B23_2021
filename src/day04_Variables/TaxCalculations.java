package day04_Variables;

public class TaxCalculations {

    public static void main(String[] args) {

        int salary = 120000;
        double stateTax = 0;
        double federalTax = 0.21;

        double totalStateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;
        double salaryAfterTax = salary - totalStateTax - totalFederalTax;

        System.out.println("Your salary is $" + salary);

        // You need to pay totalStateTax to state tax
        System.out.println("You need to pay $"+ totalStateTax + " of state tax");

        // You need to pay totalFederalTax of federal tax
        System.out.println("You need to pay $"+ totalFederalTax + " of federal tax");

        //Your take home salary is salaryAfterTax
        System.out.println("Your take home salary is $"+salaryAfterTax);




    }

}
