package Medium;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(10, 5);
        Triangle triangle = new Triangle(8, 6);

        System.out.printf("Circle Area: %.2f%n", circle.calculateArea());
        System.out.printf("Rectangle Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Triangle Area: %.2f%n", triangle.calculateArea());
    }
}