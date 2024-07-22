package oops;

public class classandobject {
    // Attributes (state)
    String color;
    String model;
    int year;

    // Method (behavior)
    void drive() {
        System.out.println("The car is driving.");
    }
    public static void main(String[] args) {
        // Creating an object of the Car class
        classandobject myCar = new classandobject();
        myCar.color = "Red";
        myCar.model = "Tesla Model 3";
        myCar.year = 2020;

        // Calling a method on the object
        myCar.drive();
    }
}
