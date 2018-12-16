package space.ishan1608;

public class DiagonalMatrix {
    public static void main(String[] args) {
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

        System.out.println("Diagonal");
        diagonalMatrix(matrix);
    }

    private static void diagonalMatrix(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(String.format("%d ", matrix[i - j] [j]));
            }
            System.out.println();
        }
        for (int i = 1; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
//                if ((j + i) < colCount) {
//                    System.out.print(String.format("%d ", matrix[rowCount - j - 1][j + i]));
//                } else {
//                    break;
//                }
                try {
                    System.out.print(String.format("%d ", matrix[rowCount - j - 1][j + i]));
                } catch (ArrayIndexOutOfBoundsException ignored) {
                    // NOTE: Can use the if check like above, but it adds an if check for every iteration
                    break;
                }
            }
            System.out.println();
        }
    }
}
