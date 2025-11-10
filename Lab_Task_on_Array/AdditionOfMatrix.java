package Lab_Task_on_Array;

import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the # of row and column of matrix's: ");
        int row = input.nextInt();
        int column = input.nextInt();

        int[][] matrix_one = new int[row][column];
        int[][] matrix_two = new int[row][column];

        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix_one[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix_two[i][j] = input.nextInt();
            }
        }

        System.out.println("First matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix_one[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix_two[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("After adding the two matrix's: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print((matrix_one[i][j] + matrix_two[i][j]) + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}