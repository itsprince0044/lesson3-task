MCQ
1.	B
2.	A
3.	C
4.	D
5.	C
6.	C
7.	C
8.	B
9.	B
10.	C
11.	B
12.	C


Section B

1. Explain method overloading in Java with examples. How is it different from method
overriding?
In Java, method overloading means having multiple methods with the same name but different parameter lists in the same class. 
It is a way to perform a similar operation in different ways depending on the input. 
For example, we can create a method add(int a, int b) to add integers and another method add(double a, double b) to add decimal numbers. 
The compiler determines which version to call based on the arguments provided.

On the other hand, method overriding occurs when a subclass provides its own version of a method that is already defined in the parent class. 
The method must have the same name, return type, and parameters. This allows the subclass to change or extend the behavior of the method. 
For example, a base class Animal might have a method makeSound(), and the Dog class can override it to give a specific implementation. 
The main difference is that overloading is done within the same class and is resolved at compile time, whereas overriding happens between a subclass and superclass and is resolved at runtime.



2. What is the role of the super keyword in Java? Demonstrate its usage with a code example.

The super keyword in Java is used to refer to the parent class of the current object. 
It is especially useful when a subclass wants to call the constructor or method of its superclass. 
This helps in reusing code and maintaining the relationship between parent and child classes. 
For example, if a parent class Animal has a constructor and a method speak(), the subclass Dog can use super() 
to call the parent constructor and super.speak() to call the parent's method inside the child class.
class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }

    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    Dog() {
        super(); 
        System.out.println("Dog Constructor");
    }

    void show() {
        super.speak(); 
    }
}


SECTION C

a. Java Class and Object
A class is like a blueprint or template that defines the structure and behavior of objects. 
It contains variables (attributes) and methods (functions). 
An object is an instance of a class that holds real data. 
For example, if Car is a class, then a specific car like "Honda" is an object of that class. 
We can create multiple objects from one class.

b. Constructor Overloading
Constructor overloading in Java means having more than one constructor in the same class with different parameters. 
It allows us to create objects in different ways. 
For example, we can create one constructor with no arguments and another with two arguments to initialize values. 
The correct constructor is called depending on how the object is created.

d. Importance of the main method
The main method in Java is the starting point of any program. 
The syntax is public static void main(String[] args). 
When we run a Java program, the JVM looks for the main method and starts executing the code from there. 
Without it, the program won’t run unless another entry point is defined.

e. Logical Operators in Java
Logical operators are used to perform logical operations on boolean values. The main logical operators in Java are:
&& (AND): returns true if both conditions are true
|| (OR): returns true if at least one condition is true
! (NOT): reverses the boolean value
They are mostly used in conditions and loops to make decisions



SECTION-D

// 1. Write a Java program that demonstrates constructor overloading.
// ● Create a Product class with attributes like id, name, and price.
// ● Provide multiple constructors to initialize these attributes differently.
// ● Display the product details using a method.


class Product {
    int id;
    String name;
    double price;
    Product() {
        id = 0;
        name = "Book";
        price = 0.0;
    }
    Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0.0;
    }

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Pen");
        Product p3 = new Product(102, "Notebook", 49.99);

        p1.display();
        p2.display();
        p3.display();
    }
}

// 2. Create a simple Employee Management System using inheritance:
// ● Define a base class Employee with name and ID.
// ● Create subclasses FullTimeEmployee and PartTimeEmployee with additional
// attributes.
// ● Override a method calculateSalary() in each subclass and display the salary.

// Java program to demonstrate inheritance and method overriding

class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    double calculateSalary() {
        return 0.0;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}
public class Task {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Manita", 1, 50000);
        PartTimeEmployee pte = new PartTimeEmployee("Nischal", 2, 20, 500);

        fte.display();
        System.out.println("Salary: Rs. " + fte.calculateSalary());

        System.out.println();

        pte.display();
        System.out.println("Salary: Rs. " + pte.calculateSalary());
    }
}

