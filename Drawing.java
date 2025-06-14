package Abstractioin;

import java.util.Scanner;

abstract class Draw{
    //Abstract methods
    public abstract double calculateVolume();
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Cube extends Draw{
    //Private attributes 
    private double length;

    //Constrcutor
    public Cube(double length){
        this.length=length;
    }

    //Setter
    public void setLength(double length){
        this.length=length;
    }

    //Getter
    public double getLength(){
        return length;
    }

    //Methods
    @Override
    public double calculateVolume() {
        return Math.pow(length,3);
    }

    @Override
    public double calculateArea() {
        return 6*(length*length);
    }

    @Override
    public double calculatePerimeter() {
        return 12 * length;
    }

}

class Cuboid extends Draw{
    //Private attributes
    private double length;
    private double breadth;
    private double height;

    //Constructor
    public Cuboid(double length,double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    //Setter
    public void setLength(double length){
        this.length=length;
    }
    public void setBreadth(double breadth){
        this.breadth=breadth;
    }
    public void setHeight(double height){
        this.height=height;
    }

    //Getter
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public double getHeight(){
        return height;
    }

    //Methods
    @Override
    public double calculateVolume() {
        return length*breadth*height;
    }

    @Override
    public double calculateArea() {
        return 2*(length*breadth+breadth*height+length*height);
    }

    @Override
    public double calculatePerimeter() {
        return 4*(length+breadth+height);
    }

}
    class Cylinder extends Draw{
    //Private attributes
    private double radius;
    private double height;

    //Constructor
    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }

    //Setters
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setHeight(double height){
        this.height=height;
    }

    //Getters
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    //Methods
    @Override
    public double calculateVolume() {
        return Math.PI*radius*radius*height;
    }

    @Override
    public double calculateArea() {
        return 2*Math.PI*radius*(radius+height);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

}
public class Drawing {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the length of cube:");
        double l=sc.nextDouble();
        Cube cube=new Cube(l);
        System.out.println("The volume of cube is "+cube.calculateVolume());
        System.out.println("The area of cube is "+cube.calculateArea());
        System.out.println("The perimeter of cube "+cube.calculatePerimeter());

        System.out.print("Enter the length of cuboid:");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of cuboid:");
        double breadth=sc.nextDouble();
        System.out.print("Enter the height of cuboid:");
        double height=sc.nextDouble();
        Cuboid cuboid=new Cuboid(length,breadth,height);
        System.out.println("The volume of cuboid "+cuboid.calculateVolume());
        System.out.println("The area of cuboid "+cuboid.calculateArea());
        System.out.println("The perimeter of cuboid "+cuboid.calculatePerimeter());

        System.out.print("Enter the radius of cylinder:");
        double radius=sc.nextDouble();
        System.out.print("Enter the height of cylinder:");
        double h=sc.nextDouble();
        Cylinder cylinder=new Cylinder(radius,h);
        System.out.println("The volume of cylinder "+cylinder.calculateVolume());
        System.out.println("The area of cylinder "+cylinder.calculateArea());
        System.out.println("The perimeter of cylinder "+cylinder.calculatePerimeter());
        sc.close();

    }
}
