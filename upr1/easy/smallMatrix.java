package upr1.easy;

public class smallMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        int mainDiagonalSum = matrix[0][0] + matrix[1][1];
        int antiDiagonalSum = matrix[0][1] + matrix[1][0];

        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of the anti-diagonal: " + antiDiagonalSum);
    }
}

