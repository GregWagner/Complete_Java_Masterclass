import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; ++i, --j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
