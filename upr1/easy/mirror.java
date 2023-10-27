package upr1.easy;

public class mirror {

        public static void main(String[] args) {

            int[] originalArray = {1, 2, 3, 4, 5};

            int[] mirroredArray = new int[originalArray.length];

            for (int i = 0; i < originalArray.length; i++) {
                mirroredArray[i] = originalArray[originalArray.length - 1 - i];
            }

            System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));
            System.out.println("Mirrored Array: " + java.util.Arrays.toString(mirroredArray));
        }
    }


