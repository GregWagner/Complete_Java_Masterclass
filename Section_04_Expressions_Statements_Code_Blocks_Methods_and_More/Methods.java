public class Methods {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        // Challenge
        // Crete a method called displayHighScorePosition
        // It should receive a player's name and a position in the high
        // score table. You should display the players name along with a
        // message like "managed to get into position x on the high score
        // table"
        //
        // Create another method called calculateHighScorePosition
        // It should be send the player score and return an int
        //      if score > 1000 return 1
        //      if score is > 500 and < 1000 return 2
        //      if score is > 100 and < 500 return 3
        //      return 4 in all other cases
        // Call both methods and display the results of the follow scores
        // 1500, 900, 400, 50
        int scorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Greg", scorePosition);

        scorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", scorePosition);

        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Steve", scorePosition);

        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Burt", scorePosition);
    }

    private static int calculateScore(boolean gameOver, int score,
            int levelCompleted, int bonus) {
        int finalScore = -1;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
        }
        return finalScore;
    }

    private static void displayHighScorePosition(String playerName, int position) {
        System.out.printf("%s managed to get into position %d " +
                "on the high score table%n", playerName, position);
    }

    private static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
