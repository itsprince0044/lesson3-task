package Task;

class Shape {
    int length, breadth, radius;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(int radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

