package space.ishan1608;

public class RotateMatrix {
    private final static String SEPARATOR = "-";

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };
        printMatrix(matrix);
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
