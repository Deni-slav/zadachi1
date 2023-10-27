package upr1.easy;

public class sumEvenOdd {
    public static void main(String[] args) {

        int[] numbers = new int[3];


        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;


        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            }
        }

        System.out.println("The sum of even numbers is: " + evenSum);
    }
}
