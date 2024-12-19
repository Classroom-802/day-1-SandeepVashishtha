package Hard;

abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    private double radius;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return PI * radius * radius;
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
    double getArea() {
        return 0.5 * base * height;
    }
}

public class Ques3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter shape type (1 for Rectangle, 2 for Circle, 3 for Triangle): ");
        int shapeType = scanner.nextInt();

        Shape shape = null;
        switch (shapeType) {
            case 1:
                System.out.println("Enter length and breadth: ");
                double length = scanner.nextDouble();
                double breadth = scanner.nextDouble();
                shape = new Rectangle(length, breadth);
                break;
            case 2:
                System.out.println("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 3:
                System.out.println("Enter base and height: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;
            default:
                System.out.println("Invalid shape type");
                System.exit(0);
        }

        System.out.println("The area of the shape is: " + shape.getArea());
        scanner.close();
    }
}