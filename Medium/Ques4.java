package Medium;

class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
}

class Result extends Student {
    private int marks1, marks2, marks3;

    public Result(int rollNumber, String name, int marks1, int marks2, int marks3) {
        super(rollNumber, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getTotal() {
        return marks1 + marks2 + marks3;
    }

    public double getPercentage() {
        return (getTotal() / 300.0) * 100;
    }

    public void display() {
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Name: " + getName());
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total: " + getTotal());
        System.out.println("Percentage: " + String.format("%.2f", getPercentage()) + "%");
    }

    public static void main(String[] args) {
        Result student1 = new Result(101, "Alice Smith", 85, 90, 80);
        student1.display();

        Result student2 = new Result(202, "Bob Martin", 70, 75, 65);
        student2.display();

        Result student3 = new Result(303, "Clara Brown", 95, 92, 88);
        student3.display();
    }
}