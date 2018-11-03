public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(-1));
//        System.out.println(reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversed = reverse(number);
        int zeros = getDigitCount(number) - getDigitCount(reversed);
        String results = "";

        while (reversed > 0) {

            switch (reversed % 10) {
                case 0:
                    results += "Zero ";
                    break;
                case 1:
                    results += "One ";
                    break;
                case 2:
                    results += "Two ";
                    break;
                case 3:
                    results += "Three ";
                    break;
                case 4:
                    results += "Four ";
                    break;
                case 5:
                    results += "Five ";
                    break;
                case 6:
                    results += "Six ";
                    break;
                case 7:
                    results += "Seven ";
                    break;
                case 8:
                    results += "Eight ";
                    break;
                case 9:
                    results += "Nine ";
                    break;
            }
            reversed /= 10;
        }
        while (zeros > 0) {
            results += "Zero ";
            --zeros;
        }
        results = results.trim();
        System.out.println(results);
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        }
        boolean negative = false;
        if (number < 0) {
            number = -number;
            negative = true;
        }
        int count = 0;
        while (number > 0) {
            ++count;
            number /= 10;
        }
        return negative ? -count : count;
    }
}
