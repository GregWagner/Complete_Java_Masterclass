import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int countOfNumbersEntered = 0;
        while (countOfNumbersEntered < 10) {
            System.out.print("Enter number #" + (countOfNumbersEntered + 1) + ": ");
            if (input.hasNextInt()) {
                sum += input.nextInt();
                ++countOfNumbersEntered;
            } else {
                System.out.println("Invalid number");
                input.nextLine();
            }
        }
        System.out.println("The sum is " + sum);

        input.close();
    }
}
