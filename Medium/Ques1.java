package Medium;

public class Ques1 {

    public static double calculateArea(double radius) {
        return 3.14159 * radius * radius;
    }

    public static double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public static double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double radius1 = 5;
        double length1 = 4, breadth1 = 6;
        double base1 = 3, height1 = 7;
        System.out.println(calculateArea(radius1));
        System.out.println(calculateArea(length1, breadth1));
        System.out.println(calculateArea(base1, height1, true));

        double radius2 = 10;
        double length2 = 15, breadth2 = 8;
        double base2 = 12, height2 = 9;
        System.out.println(calculateArea(radius2));
        System.out.println(calculateArea(length2, breadth2));
        System.out.println(calculateArea(base2, height2, true));

        double radius3 = 1;
        double length3 = 2, breadth3 = 3;
        double base3 = 5, height3 = 8;
        System.out.println(calculateArea(radius3));
        System.out.println(calculateArea(length3, breadth3));
        System.out.println(calculateArea(base3, height3, true));
    }
}
