package Medium;

public class Ques2 {

    public static int calculateSalary(int stipend) {
        return stipend;
    }

    public static int calculateSalary(int baseSalary, int bonuses) {
        return baseSalary + bonuses;
    }

    public static int calculateSalary(int baseSalary, int bonuses, int incentives) {
        return baseSalary + bonuses + incentives;
    }

    public static void main(String[] args) {
        int internStipend1 = 10000;
        int employeeBaseSalary1 = 50000;
        int employeeBonuses1 = 20000;
        int managerBaseSalary1 = 80000;
        int managerBonuses1 = 30000;
        int managerIncentives1 = 20000;

        System.out.println("Intern Salary: " + calculateSalary(internStipend1));
        System.out.println("Employee Salary: " + calculateSalary(employeeBaseSalary1, employeeBonuses1));
        System.out.println("Manager Salary: " + calculateSalary(managerBaseSalary1, managerBonuses1, managerIncentives1));
    }
}