// MCQ
1-extends
2-21
3-An instance of class
4- ==
5-Exits the loop  entirely
6-void method(int x)
7-3
8-interface InterfaceName{}
9-Heap Memory
10-inheritance
11-Exits the method and optionally returns a value
12-Java105



SECTION-B

// 1. Define encapsulation. How is it implemented in Java? Provide an example using getter
// and setter methods

Encapsulation is the process of wrapping data (variables) and methods into a single unit, typically a class. 
It protects data from direct access by using access modifiers and provides controlled access via getter and setter methods.
class Person {
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Varunika");
        System.out.println("Name: " + p.getName());
    }
}


// 2.Explain the concept of constructor chaining in Java. Demonstrate it using the this() keyword with code.

Constructor chaining is when a constructor calls another constructor of the same class using this(),
to reduce code duplication.

class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 18); // Calls the parameterized constructor
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Aarav", 22);
        s1.display();  // Output: Unknown - 18
        s2.display();  // Output: Aarav - 22
    }
}


SECTION C 

a) Object class in Java:
The Object class is the root of the class hierarchy. Every class in Java inherits from it. Common methods include toString(), equals(), and hashCode().

b) break vs continue:

break exits the loop entirely.

continue skips the current iteration and continues to the next loop cycle.

c) Role of access modifiers:
Access modifiers (public, private, protected, default) control the visibility of classes, methods, and variables. They support encapsulation and security.

d) instanceof operator:
Used to check whether an object is an instance of a particular class or subclass.
Example: if (obj instanceof String)

e) class vs interface:
-class can have both method implementations and variables.
-interface can only have abstract methods (before Java 8), used for full abstraction and multiple inheritance.


SECTION-D 

// 2. Write a Java program for a basic course registration system:
// ● Define a class Course with courseId, courseName, and instructor.
// ● Allow registering multiple courses using an ArrayList.
// ● Display all registered courses in a formatted output.

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Mammal extends Animal {
    void makeSound() {
        System.out.println("Mammal makes a sound");
    }
}

class Dog extends Mammal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks
    }
}


// 3. Create a program that demonstrates the use of static variables and methods:
// ● Define a class Counter that tracks how many objects have been created.
// ● Use a static variable and a static method to display the total count.
// ● Test it by creating multiple objects in the main method.

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount();  // Output: Total objects created: 3
    }
}
