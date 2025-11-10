package Lab_Task_on_Array;

import java.util.Scanner;

public class isEqualMat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input for the first matrix
        System.out.print("Enter the  row and column of the first matrix: ");
        int row_first = input.nextInt();
        int column_first = input.nextInt();
        int[][] matrix_one = new int[row_first][column_first];
        System.out.print("Enter the elements of the first matrix: ");
        for (int i = 0; i < row_first; i++) {
            for (int j = 0; j < column_first; j++) {
                matrix_one[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter the  row and column of the second matrix: ");
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

        if (row_first != row_second || column_first != column_second) {
            System.out.print("Matrices are not equal!");
            return;
        }

        for (int i = 0; i < row_first; i++) {
            for (int j = 0; j < column_first; j++) {
                if (matrix_one[i][j] != matrix_two[i][j]) {
                    System.out.print("Matrices are not equal!");
                    return;
                }
            }
        }

        System.out.print("Both matrices are equal!");

        input.close();
    }
}