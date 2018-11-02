public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int orgB = b;
        while (a > 0) {
            int digitFromA = a % 10;
            while (b > 0) {
                if (digitFromA == b % 10) {
                    System.out.println("TRUE");
                    return true;
                }
                b /= 10;
            }
            b = orgB;
            a /= 10;
        }
        return false;
    }
}
