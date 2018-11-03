import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean first = true;
        int max = 0;
        int min = 0;
        while (true) {
            System.out.print("Enter number: ");
            if (!input.hasNextInt()) {
                break;
            }
            int number = input.nextInt();
            if (first) {
                first = false;
                max = number;
                min = number;
            } else if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.printf("Min: %d, Max: %d%n", min, max);
        input.close();
    }
}
