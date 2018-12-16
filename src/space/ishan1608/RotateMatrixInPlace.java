package space.ishan1608;

public class RotateMatrixInPlace {
    public static void main(String[] args) {
        System.out.println(RotateMatrixInPlace.class.getSimpleName());
        int[][] matrix = {
                { 1,  2,  3,  4,  5},
                { 6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        System.out.println("Original");
        MatrixUtils.printMatrix(matrix);
    }
}
