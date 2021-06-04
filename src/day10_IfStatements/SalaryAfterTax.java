package day10_IfStatements;

public class SalaryAfterTax {

    public static void main(String[] args) {
        double salary = 75_000;
        boolean isMarried = true;

        double taxRate = 0;

        if(salary>= 130000 ){ // false: salary < 130000
            taxRate = 0.35;
        }else if(salary>= 100000 ){ // false: salary < 100000
            taxRate = 0.30;
        }else if(salary>= 80000 ){ // false: salary < 80000
            taxRate = 0.25;
        }else { // salary < 80000
            taxRate = 0.20;
        }
        // tax = 20%


        if (isMarried){ // if person is married
            taxRate -= 0.05; // tax rate will be subtracted by 5
        }
        // tax: 15


        double salaryAfterTax = salary - (salary*taxRate);

        System.out.println("Salary After Tax = " + salaryAfterTax);



    }


}

/*
2. Write a program that can calculate the salary after tax based on the following requirments.
				the tax rates are:
						35% for salary of 130K or more
						30% for salary of 100K to 130k
						25% for salary of 80K to 100K
						20% for salary of 79K or less

				in addition,if the person is married, he/she will pay 5% less tax
 */
