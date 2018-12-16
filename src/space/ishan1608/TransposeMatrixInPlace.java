package space.ishan1608;

public class TransposeMatrixInPlace {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  3,  4,  5},
                { 6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };

        System.out.println("Original");
        MatrixUtils.printMatrix(matrix);

        transposeMatrixInPlace(matrix);

        System.out.println("Transposed");
        MatrixUtils.printMatrix(matrix);
    }

    private static void transposeMatrixInPlace (int[][] matrix) {
        int rowCount = matrix.length;
        for (int i = 0; i < rowCount; i++) {
            for (int j = i + 1; j < rowCount; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
