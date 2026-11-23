import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of dimensions for the matrices: ");
        int dme = scanner.nextInt();

        int[][] matrixA = new int[dme][dme];
        int[][] matrixB = new int[dme][dme];
        int[][] matrixC = new int[dme][dme];

        System.out.println("Enter elements for matrix A:");
        for (int i = 0; i < dme; i++) {
            for (int j = 0; j < dme; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements for matrix B:");
        for (int i = 0; i < dme; i++) {
            for (int j = 0; j < dme; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < dme; i++) {
            for (int j = 0; j < dme; j++) {
                for (int k = 0; k < dme; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Resultant matrix C:");
        printMatrix(matrixC);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
