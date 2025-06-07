package Task;

class Vehicle {
    void startEngine() {
        System.out.println("Engine started");
    }

    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving the car");
    }
}

class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Riding the motorcycle");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();

        Motorcycle myBike = new Motorcycle();
        myBike.startEngine();
        myBike.ride();
        myBike.stopEngine();
    }
}
