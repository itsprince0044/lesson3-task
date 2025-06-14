package Abstractioin;

abstract class Vehicle{
    //Methods
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle{
    //Methods
    @Override
    public void startEngine(){
        System.out.println("The cars engine has been  started.");
    }
    @Override
    public void stopEngine(){
        System.out.println("The cars engine has been stopped.");
    }
}

class Bike extends Vehicle{
    //Methods
    @Override
    public void startEngine(){
        System.out.println("The bike engine has been  started.");
    }
    @Override
    public void stopEngine(){
        System.out.println("The bike engine has been stopped.");
    }
}


public class Vehicless {
    public static void main(String[]args){
        Car car=new Car();
        car.startEngine();
        Bike bike=new Bike();
        bike.stopEngine();
    }
}
