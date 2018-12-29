import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many integers do you want to enter: ");
        int count = input.nextInt();
        int[] a = readIntegers(count);
        System.out.printf("The minimum number is %d%n", findMin(a));
    }

    public static int[] readIntegers(int count) {
        int[] a = new int[count];
        System.out.printf("Enter %d integers:%n", count);
        for (int i = 0; i < count; ++i) {
            a[i] = input.nextInt();
        }
        return a;
    }

    public static int findMin(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int item : a) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }
}
