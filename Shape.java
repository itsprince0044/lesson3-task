package Abstractioin;

import java.util.Scanner;

abstract class Shapes{
    //Method
    public abstract double calculateArea();
    
}

class Rectangle extends Shapes{
    //Private attribute
    private double length;
    private double breadth;

    //constructor
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    
    //Setters
    public void setLength(double length){
        this.length=length;
    }
    public void setBreadth(double breadth){
        this.breadth=breadth;
    }

    //Getters
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    //Methods
    @Override
    public double calculateArea(){
        double area=length*breadth;
        return area;
    }
}
    class Circlessss extends Shapes{
    //Private attribute
    private double radius;

    //constructor
    public Circlessss(double radius){
        this.radius=radius;
    }
    
    //Setters
    public void setRadius(double radius){
        this.radius=radius;
    }

    //Getters
    public double getRadius(){
        return radius;
    }
    //Methods
    @Override
    public double calculateArea(){
        double area=Math.PI*Math.pow(radius,2);
        return area;
    }
}


public class Shape {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of rectangle:");
        double breadth=sc.nextDouble();
        Rectangle rectangle=new Rectangle(length,breadth);
        System.out.println("The area of rectangle is "+rectangle.calculateArea());
        
        System.out.print("Enter the radius of circle:");
        double radius=sc.nextDouble();
        Circlessss circle=new Circlessss(radius);
        System.out.println("The area of circle is "+circle.calculateArea());
        sc.close();
    }
}
