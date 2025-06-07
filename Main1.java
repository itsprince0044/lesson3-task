package Task;

class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car. Brand: Toyota, Model: Camry");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();     // Inherited method
        myCar.display();   // Own method
    }
}

