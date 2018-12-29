import java.util.Scanner;

public class Arrays {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; ++i) {
            System.out.printf("Element %d, value was %d%n", i, myIntegers[i]);
        }
        System.out.printf("Average is %f%n", getAverage(myIntegers));
    }

    private static int[] getIntegers(int number) {
        System.out.printf("Enter %d integer values.%n", number);
        int[] values = new int[number];
        for (int i = 0; i < values.length; ++i) {
            values[i] = input.nextInt();
        }
        return values;
    }

    private static double getAverage(int[] a) {
        double sum = 0.0;
        for (int i = 0; i < a.length; ++i) {
            sum += a[i];
        }
        return sum / a.length;

    }
}
