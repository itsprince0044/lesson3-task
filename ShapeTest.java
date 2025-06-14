package Abstractioin;

import java.util.Scanner;

abstract class Shape{
    //Methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Rectangle extends Shape{
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
    public double calculateArea() {
        double area=length*breadth;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter=2*(length+breadth);
        return perimeter;
    }
}

class Circlesss extends Shape{
    //Private attribute
    private double radius;

    //constructor
    public Circlesss(double radius){
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

    @Override
    public double calculatePerimeter() {
        double perimeter=2*Math.PI*radius;
        return perimeter;
    }
}

class Triangle extends Shape{
    //Private Attributes
    private double a;
    private double b;
    private double c;

    //Constructor
    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    //Methods
    public double calculatePerimeter(){
        double perimeter=a+b+c;
        return perimeter;
    }
    public double calculateArea(){
        double s=calculatePerimeter();
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    
}

public class ShapeTest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of rectangle:");
        double breadth=sc.nextDouble();
        Rectangle rectangle=new Rectangle(length,breadth);
        System.out.println("The area of rectangle is "+rectangle.calculateArea());
        System.out.println("The perimeter of rectangle is "+rectangle.calculatePerimeter());
        
        System.out.print("Enter the radius of circle:");
        double radius=sc.nextDouble();
        Circlesss circle=new Circlesss(radius);
        System.out.println("The area of circle is "+circle.calculateArea());
        System.out.println("The perimeter of circle is "+circle.calculatePerimeter());

        System.out.print("Enter the first side of triangle:");
        double a=sc.nextDouble();
        System.out.print("Enter the second side of triangle:");
        double b=sc.nextDouble();
        System.out.print("Enter the third side of triangle:");
        double c=sc.nextDouble();
        Triangle triangle=new Triangle(a,b,c);
        System.out.println("The area of triangle is "+triangle.calculateArea());
        System.out.println("The perimeter of traiangle is "+triangle.calculatePerimeter());
        sc.close();
    }
}
