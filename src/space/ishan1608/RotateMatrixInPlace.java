package space.ishan1608;

public class RotateMatrixInPlace {
    public static void main(String[] args) {
        System.out.println(RotateMatrixInPlace.class.getSimpleName());
//        int[][] matrix = {
//                { 1,  2,  3,  4,  5,  6},
//                { 7,  8,  9, 10, 11, 12},
//                {13, 14, 15, 16, 17, 18},
//                {19, 20, 21, 22, 23, 24},
//                {25, 26, 27, 28, 29, 30},
//                {31, 32, 33, 34, 35, 36},
//        };
        int[][] matrix = {
                { 1,  2,  3,  4,  5,  6,  7},
                { 8,  9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, 32, 33, 34, 35},
                {36, 37, 38, 39, 40, 41, 42},
                {43, 44, 45, 46, 47, 48, 49},
        };
        System.out.println("Original");
        MatrixUtils.printMatrix(matrix);

        rotateMatrixInPlace(matrix);

        System.out.println("Rotated");
        MatrixUtils.printMatrix(matrix);
    }

    private static void rotateMatrixInPlace(int[][] matrix) {
        int matrixSize = matrix.length;
        for (int i = 0; i < matrixSize / 2; i++) {
            int squareSize = matrixSize - (2 * i);
            for (int j = 0; j < squareSize - 1; j++) {
                int c1X = i;
                int c1Y = i + j;
                int c2X = i + j;
                int c2Y = squareSize - 1 + i;
                int c3X = squareSize - 1 + i;
                int c3Y = squareSize - 1 - j + i;
                int c4X = squareSize - 1 - j + i;
                int c4Y = i;

                // Co-ordinate 1
                int c1 = matrix[c1X][c1Y];
                // Co-ordinate 2
                int c2 = matrix[c2X][c2Y];
                // Co-ordinate 3
                int c3 = matrix[c3X][c3Y];
                // Co-ordinate 4
                int c4 = matrix[c4X][c4Y];

                // C2 --> C1
                matrix[c2X][c2Y] = c1;
                // C3 --> C2
                matrix[c3X][c3Y] = c2;
                // C4 --> C3
                matrix[c4X][c4Y] = c3;
                // C1 --> C4
                matrix[c1X][c1Y] = c4;
            }
        }
    }
}
