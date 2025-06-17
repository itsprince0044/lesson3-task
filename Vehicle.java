abstract class Vehicle {
    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    double calculateRentalCost(int days) { return days * 50; }
}

class Motorcycle extends Vehicle {
    double calculateRentalCost(int days) { return days * 30; }
}

class Bicycle extends Vehicle {
    double calculateRentalCost(int days) { return days * 10; }
}

