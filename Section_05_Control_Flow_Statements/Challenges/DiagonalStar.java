public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int currentFirstStar = 1;
        int currentLastStar = number - 2;
        for (int row = 0; row < number; ++row) {
            // first and last row
            if (row == 0 || row == number -1) {
                for (int col = 0; col < number; ++col) {
                    System.out.print('*');
                }
                System.out.println();
            } else {
                for (int col = 0; col < number; ++col) {
                    if (col == 0 || col == number - 1) {
                            System.out.print('*');
                    } else if (currentFirstStar == col || currentLastStar == col) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                ++currentFirstStar;
                --currentLastStar;
                System.out.println();
            }
        }
    }
}
