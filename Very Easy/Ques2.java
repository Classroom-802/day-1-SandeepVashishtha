import java.util.Scanner;

public class Ques2 {

    public static String isPrime(int n) {
        if (n <= 1) {
            return "Not Prime";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
        scanner.close();
    }
}
