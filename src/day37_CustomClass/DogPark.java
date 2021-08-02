package day37_CustomClass;

public class DogPark {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name="Kangal";
        dog1.gender="Female";
        dog1.breed="Kangal";
        dog1.age=5;
        dog1.size="large";
        dog1.color="yellow";


        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.gender);

        Dog dog2 = new Dog();
        dog2.setInfo("Bobby","Shepard","Female","Brown","Large",3);


    }
}
