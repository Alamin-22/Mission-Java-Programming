package Lab_Task_on_Array;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row and column of the matrix: ");
        int row = input.nextInt();
        int column = input.nextInt();

        int[][] matrix = new int[row][column];
        System.out.print("Enter the elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("First matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transpose_matrix = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose_matrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose matrix: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose_matrix[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}