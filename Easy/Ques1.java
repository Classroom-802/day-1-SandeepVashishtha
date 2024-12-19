package Easy;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        
        System.out.println(count);
    }
}