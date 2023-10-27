package upr1.easy;

public class biggestNum {
    public static void main(String[] args) {

        int[] array = {12, 5, 27, 8, 18};

        int maxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + maxElement);
    }
}
