package upr1.easy;

import java.util.Random;
import java.util.Scanner;

public class easyProjects {
    public static void main(String[] args) {

        int[] numbers = new int[3];


        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the elements is: " + sum);
    }

    public static class CombinedExercise {
        public static void main(String[] args) {
            int[] numbers = initializeArray(10);
            int max = findMaxValue(numbers);
            int min = findMinValue(numbers);

            System.out.println("Initialized Array:");
            printArray(numbers);
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);

            int[] rearrangedArray = rearrangeArray(numbers);
            System.out.println("Rearranged Array:");
            printArray(rearrangedArray);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to check if it's prime: ");
            int numberToCheck = scanner.nextInt();
            scanner.close();

            boolean isPrime = isPrime(numberToCheck);

            System.out.println("Is the number prime? " + isPrime);
        }

        public static int[] initializeArray(int size) {
            int[] array = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(100);
            }

            return array;
        }

        public static int findMaxValue(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        public static int findMinValue(int[] arr) {
            int min = arr[0];
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }

        public static int[] rearrangeArray(int[] arr) {
            int[] rearrangedArray = new int[arr.length];
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                rearrangedArray[i] = arr[n - 1 - i];
            }
            return rearrangedArray;
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }

            if (num <= 3) {
                return true;
            }

            if (num % 2 == 0 || num % 3 == 0) {
                return false;
            }

            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }

            return true;
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static class Matrix {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int sumWithRepetition = sumDiagonalWithRepetition(matrix);
            int sumWithoutRepetition = sumDiagonalWithoutRepetition(matrix);

            System.out.println("Sum with repetition: " + sumWithRepetition);
            System.out.println("Sum without repetition: " + sumWithoutRepetition);
        }

        public static int sumDiagonalWithRepetition(int[][] matrix) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i];
                sum += matrix[i][matrix.length - 1 - i];
            }
            return sum;
        }

        public static int sumDiagonalWithoutRepetition(int[][] matrix) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i]; // upr1.easy.easyProjects.Main diagonal
                if (i != matrix.length / 2) {
                    sum += matrix[i][matrix.length - 1 - i];
                }
            }
            return sum;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            int[] numbers = new int[5];
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            scanner.close();

            int totalSum = findTotalSum(numbers);
            int evenSum = findEvenSum(numbers);
            int oddSum = findOddSum(numbers);

            System.out.println("Total Sum: " + totalSum);
            System.out.println("Sum of Even Elements: " + evenSum);
            System.out.println("Sum of Odd Elements: " + oddSum);
        }

        public static int findTotalSum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }

        public static int findEvenSum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    sum += num;
                }
            }
            return sum;
        }

        public static int findOddSum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                if (num % 2 != 0) {
                    sum += num;
                }
            }
            return sum;
        }
    }

    public static class MaxMin {
        public static void main(String[] args) {
            int[] array = {5, 8, 2, 10, 15, 1, 6, 12};

            int max = findMaxValue(array);
            int min = findMinValue(array);

            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }

        public static int findMaxValue(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        public static int findMinValue(int[] arr) {
            int min = arr[0];
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
    }
}

