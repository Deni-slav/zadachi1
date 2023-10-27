package upr1.easy;
import java.util.Scanner;
public class stars {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer 'n' for the square size: ");
            int n = scanner.nextInt();
            scanner.close();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


