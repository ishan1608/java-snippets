package space.ishan1608;

public class RotateMatrixExtraMemory {

    public static void main(String[] args) {
        System.out.println(RotateMatrixExtraMemory.class.getSimpleName());
        int[][] matrix = {
                { 1,  2,  3,  4,  5},
                { 6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };
        System.out.println("Original");
        MatrixUtils.printMatrix(matrix);

        int[][] rotatedMatrix = rotateMatrixExtraMemory(matrix);

        System.out.println("Rotated");
        MatrixUtils.printMatrix(rotatedMatrix);
    }

    private static int[][] rotateMatrixExtraMemory(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] rotatedMatrix = new int[numCols][numRows];

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                rotatedMatrix[i][j] = matrix[numRows - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }
}
