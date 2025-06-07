package Task;

class Shape {
    double calculateArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }

    double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());

        Circle circle = new Circle(7);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());
    }
}

