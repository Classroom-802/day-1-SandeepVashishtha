package Easy;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int largestDigit = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            n /= 10;
        }

        System.out.println(largestDigit);
        scanner.close();
    }
}