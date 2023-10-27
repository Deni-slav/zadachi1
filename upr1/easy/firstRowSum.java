package upr1.easy;

public class firstRowSum {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        int firstRowSum = matrix[0][0] + matrix[0][1];

        System.out.println("Sum of the elements in the first row: " + firstRowSum);
    }
}

