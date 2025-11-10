package Lab_Task_on_Array;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the of row and column of the first matrix: ");
        int row_first = input.nextInt();
        int column_first = input.nextInt();
        int[][] matrix_one = new int[row_first][column_first];
        System.out.print("Enter the elements of the first matrix: ");
        for (int i = 0; i < row_first; i++) {
            for (int j = 0; j < column_first; j++) {
                matrix_one[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter the of row and column of the second matrix: ");
        int row_second = input.nextInt();
        int column_second = input.nextInt();
        int[][] matrix_two = new int[row_second][column_second];
        System.out.print("Enter the elements of the second matrix: ");
        for (int i = 0; i < row_second; i++) {
            for (int j = 0; j < column_second; j++) {
                matrix_two[i][j] = input.nextInt();
            }
        }

        System.out.println("First matrix: ");
        for (int i = 0; i < row_first; i++) {
            for (int j = 0; j < column_first; j++) {
                System.out.print(matrix_one[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second matrix: ");
        for (int i = 0; i < row_second; i++) {
            for (int j = 0; j < column_second; j++) {
                System.out.print(matrix_two[i][j] + " ");
            }
            System.out.println();
        }

        if (column_first != row_second) {
            System.out.print("Multiplication not possible!");
            return;
        }

        int[][] ans_matrix = new int[row_first][column_second];
        for (int i = 0; i < row_first; i++) {
            for (int j = 0; j < column_second; j++) {
                ans_matrix[i][j] = 0;
                for (int k = 0; k < row_first; k++) {
                    ans_matrix[i][j] += (matrix_one[i][k] * matrix_two[k][j]);
                }
            }
        }

        // output
        System.out.println("After multiplicating the two matrix's: ");
        for (int i = 0; i < row_first; i++) {
            for (int j = 0; j < column_second; j++) {
                System.out.print(ans_matrix[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}