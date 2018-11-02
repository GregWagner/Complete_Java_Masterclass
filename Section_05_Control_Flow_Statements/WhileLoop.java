public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            ++count;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            ++count;
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            ++count;
        } while (count != 6);

        // Challenge
        int number = 5;
        count = 0;
        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println("Even number " + number);
                ++count;
                if (count == 5) {
                    break;
                }
            }
            ++number;
        }
        System.out.println(count + " even numbers were found.");
    }

    private static boolean isEvenNumber(int n) {
        return ((n % 2) == 0);
    }
}
