public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21) == 7);
        System.out.println(getLargestPrime(217) == 31);
        System.out.println(getLargestPrime(0) == -1);
        System.out.println(getLargestPrime(45) == 5);
        System.out.println(getLargestPrime(-1) == -1);
        System.out.println(getLargestPrime(7) == 7);
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int i = number / 2; i > 1; --i) {
            if (number % i == 0) {
                // check if i is prime
                boolean isPrime = true;
                for (int n = 2; n <= i / 2; ++n) {
                    if (i % n == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    return i;
                }
            }
        }
        return number;
    }
}
