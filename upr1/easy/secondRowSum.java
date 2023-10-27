package upr1.easy;

public class secondRowSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        int secondRowSum = matrix[1][0] + matrix[1][1];

        System.out.println("Sum of the elements in the second row: " + secondRowSum);
    }
}

