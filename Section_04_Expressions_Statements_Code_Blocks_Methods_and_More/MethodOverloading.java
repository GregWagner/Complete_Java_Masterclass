public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Greg", 500);
        System.out.println("The new score is " + newScore);

        calculateScore(75);
        calculateScore();

        // Challenge
        // Create a method called calcFeetAndInchesToCentimeters.
        // It needs to have 2 parameters - feet and inches
        // You should validate that the parameters are valid and return -1
        // if not.
        //
        // Create an overloaded method that only takes inches 
        //
        System.out.printf("%d feet %d inches = %f centimeters%n", 3, 7,
                calcFeetAndInchesToCentimeters(3, 7));

        System.out.printf("%d inches = %f centimeters%n", 43,
                calcFeetAndInchesToCentimeters(43));
    }

    private static double calcFeetAndInchesToCentimeters(int inches) {
        return calcFeetAndInchesToCentimeters(inches / 12, inches % 12);
    }
    private static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }
        int totalInches = inches + (12 * feet);
        return totalInches * 2.54;
    }

    private static int calculateScore() {
        System.out.printf("No player name, no player score%n");
        return 0;
    }

    private static int calculateScore(String playerName, int score) {
        System.out.printf("Player %s scored %d%n", playerName, score);
        return score * 1000;
    }

    private static int calculateScore(int score) {
        System.out.printf("Player %s scored %d%n", "Unnamed", score);
        return score * 1000;
    }
}
