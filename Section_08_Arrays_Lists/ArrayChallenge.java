import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {

    public static void main(String[] args) {
        int[] a = getIntegers(10);
        printArray(sortIntegers(a));
    }

    private static int[] getIntegers(int number) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[number];

        System.out.printf("Enter %d integer values:%n", number);
        for (int i = 0; i < values.length; ++i) {
            values[i] = input.nextInt();
        }
        return values;
    }

    private static void printArray(int[] a) {
        for (int item : a) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static int[] sortIntegers(int[] a) {
        int[] b = Arrays.copyOf(a, a.length);

        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < b.length - 1; ++i) {
                if (b[i] < b[i + 1]) {
                    int temp = b[i];
                    b[i] = b[i + 1];
                    b[i + 1] = temp;
                    swap = true;
                }
            }
        }
        return b;
    }
}
