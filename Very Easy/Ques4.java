import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        
        System.out.println(sum);
    }
}