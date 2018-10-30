public class KeywordsAndExpressions {
    public static void main(String[] args) {

        // one mile is equal to 1.609344 kilometers
        double kilometres = 100.0 * 1.609344;

        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        // Challenge
        // In the following code, write what parts  of the code are expressions
        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score");
            score = 0;
        }

        // The expressions are:
        // score = 100
        // score > 99
        // "You got the high score"
        // score = 0
    }
}
