public class ForLoop {

    public static void main(String[] args) {
        for (double interestRate = 2.0; interestRate <= 8.0; ++interestRate) {
            System.out.printf("10,000 at %.2f interest = %.2f%n",
                    interestRate, calculateInterest(10000.0, interestRate));
        }

        System.out.println();;
        for (double interestRate = 8.0; interestRate >= 2.0; --interestRate) {
            System.out.printf("10,000 at %.2f interest = %.2f%n",
                    interestRate, calculateInterest(10000.0, interestRate));
        }

        int count = 0;
        for (int i = 1; i < 100; ++i) {
            if (isPrime(i)) {
                ++count;
                System.out.println(i);
                if (count == 3) {
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    private static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100.0));
    }
}
