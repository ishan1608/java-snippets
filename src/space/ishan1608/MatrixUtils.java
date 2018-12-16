package space.ishan1608;

class MatrixUtils {
    private final static String SEPARATOR = "-";

    static void printMatrix(int[][] matrix) {
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
