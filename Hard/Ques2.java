package Hard;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrixA = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        int p = scanner.nextInt();
        int[][] matrixB = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int operation = scanner.nextInt();

        if (operation == 1) {
            if (m == n && n == p) {
                int[][] result = operate(matrixA, matrixB);
                printMatrix(result);
            } else {
                System.out.println("Invalid dimensions for operation.");
            }
        } else if (operation == 2) {
            if (n == matrixB.length) {
                int[][] result = operate(matrixA, matrixB, m, p);
                printMatrix(result);
            } else {
                System.out.println("Invalid dimensions for operation.");
            }
        } else {
            System.out.println("Invalid operation.");
        }

        scanner.close();
    }

    public static int[][] operate(int[][] matrixA, int[][] matrixB) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public static int[][] operate(int[][] matrixA, int[][] matrixB, int m, int p) {
        int n = matrixA[0].length;
        int[][] result = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}