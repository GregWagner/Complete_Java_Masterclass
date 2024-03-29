public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result -= 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result *= 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result /= 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result %= 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result += 1;
        System.out.println("Result is now " + result);
        ++result;
        System.out.println("Result is now " + result);
        --result;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One or both of these tests is true");
        }

        int newValue = 50;
        if (newValue = 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {     // should be == or if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Challenge
        // 1. Create a double variable with the value of 20
        // 2. Create a second double variable with the value 80
        // 3. Add both numbers up and multiple by 100
        // 4. Use the remainder operator to figure out the remainder from
        //    the sum of #3 divided by 40
        // 5. Create a boolean variabe that assigns the value true if the
        //    remainder  in #4 is 0, or false if it is not zero
        // 6. Output the remainder variable
        // 7. Write an if-then statement that displays a message
        //    "Got some remainder" if the boolean in #5  is not true
        double firstNumber = 20.0;
        double secondNumber = 80.0;
        double sum = (firstNumber + secondNumber) * 100.0;
        double remainder = sum % 40.0;
        boolean isRemainderZero = remainder == 0.0;
        System.out.println("isRemainderZero: " + isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
    }
}
