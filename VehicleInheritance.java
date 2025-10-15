// File: VehicleInheritance.java
class Vehicle {
    String brand;

    void displayBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

// Car class inherits from Vehicle
class Car extends Vehicle {
    String model;

    void displayModel() {
        System.out.println("Car Model: " + model);
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.model = "Fortuner";

        c.displayBrand(); // inherited method
        c.displayModel(); // subclass method
    }
}
