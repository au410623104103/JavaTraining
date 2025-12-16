public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define two matrices
        int[][] A = {
            {1, 4, 1},
            {4, 1, 4}
        };

        int[][] B = {
            {4, 4},
            {04, 01},
            {11, 14}
        };

        // Rows of A, Columns of A, Columns of B
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        // Resultant matrix
        int[][] result = new int[rowsA][colsB];

        // Matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}