public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
        }
        return (sum == 0 ? -1 : sum);
    }
}
