package space.ishan1608;

public class RotateMatrix {
    private final static String SEPARATOR = "-";

    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  3,  4,  5},
                { 6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };
        System.out.println("Original");
        printMatrix(matrix);

        int[][] rotatedMatrix = rotateMatrixExtraMemory(matrix);

        System.out.println("Rotated - Extra Memory");
        printMatrix(rotatedMatrix);
    }

    private static int[][] rotateMatrixExtraMemory(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] rotatedMatrix = new int[numCols][numRows];

        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[numRows - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        int numColumns = matrix[0].length;
        _printBorder(numColumns);
        for (int[] row : matrix) {
            System.out.print(SEPARATOR);
            for (int col : row) {
                System.out.print(String.format("%s%d ", col <= 9 ? "  " : " ", col));
                System.out.print(SEPARATOR);
            }
            System.out.println();
        }
        _printBorder(numColumns);
    }

    private static void _printBorder(int numColumns) {
        for (int i = 0; i < numColumns; i++) {
            System.out.print(SEPARATOR.repeat(5));
        }
        System.out.println(SEPARATOR);
    }
}
