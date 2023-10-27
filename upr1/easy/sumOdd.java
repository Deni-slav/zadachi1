package upr1.easy;

public class sumOdd {
    public static void main(String[] args) {

        int[] numbers = new int[3];


        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;

        // Calculate the sum of even numbers
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddSum += numbers[i];
            }
        }

        System.out.println("The sum of odd numbers is: " + oddSum);
    }
}
