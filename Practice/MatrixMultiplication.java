package Practice;

public class MatrixMultiplication {

    public static void main(String[] args) {

        int[][] matrixA = {
                { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
        };

        int[][] matrixB = {
                { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
        };
        // i j
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                result[i][j] = 0;

                for (int k = 0; k < 3; k++) {

                    result[i][j] += matrixA[i][k] * matrixB[k][j];

                }
                System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }

    }

}
