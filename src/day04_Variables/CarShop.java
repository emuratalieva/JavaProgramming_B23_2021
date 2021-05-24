package day04_Variables;

public class CarShop {

    public static void main(String[] args) {
        String brand = "BMW",
                model = "X5",
                color = "Red";

        int year = 2019,
            miles = 20000;

        int price = 45000;

    //    2015 Toyota Camry, White, 45000 miles, $25000.
        System.out.println(year+ " " +brand +" " +model+", "+color +", "+miles + " miles, " + price+" dollars.");

        System.out.println("2015 Toyota Camry, White, 45000 miles, 25000.0 dollars.");


    }


}
/*
brand, model, color, year, price, miles
 */