package Abstractioin;

interface Employee{
    public void work();
    public double getSalary();
}

class Chefs implements Employee{
    //Private attributes
    private double salary;

    //Constructor
    public Chefs(double salary){
        this.salary=salary;
    }

    //Setter
    public void setSalary(double salary){
        this.salary=salary;
    }
    @Override
    public void work() {
        System.out.println("Menu Planning & Recipe Development");
    }

    @Override
    public double getSalary(){
        return salary;
    }

}

class Waiters implements Employee{
    //Private attributes
    private double salary;

    //Constructor
    public Waiters(double salary){
        this.salary=salary;
    }
    @Override
    public void work() {
        System.out.println("Serve the food ton the customers.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
    
}


public class ResturantManagementSystem {
    public static void main (String[]args){
        Chefs chefs=new Chefs(1000000);
        chefs.work();
        System.out.println("The salary of chefs is "+chefs.getSalary());
        Waiters waiters =new Waiters(300000);
        waiters.work();
        System.out.println("The salary of waiters is "+waiters.getSalary());
    }
}
