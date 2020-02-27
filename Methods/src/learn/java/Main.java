package learn.java;

public class Main {

    public static void main(String[] args) {
        int playerScore0 = 1_500;
        int playerScore1 = 900;
        int playerScore2 = 400;
        int playerScore3 = 50;

        displayHighScorePosition("Pablo", calculateHighScorePosition(playerScore0));
        displayHighScorePosition("Matt", calculateHighScorePosition(playerScore1));
        displayHighScorePosition("Juan", calculateHighScorePosition(playerScore2));
        displayHighScorePosition("Suzie", calculateHighScorePosition(playerScore3));

    }

    public static int calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus) {

        if(isGameOver) {
            return score + (levelCompleted * bonus) + 1_000;
        }
        return -1;

    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;  // assuming position 4 will be returned

        if (score >= 1_000) position = 1;
        else if (score >= 500) position = 2;
        else if (score >= 100) position = 3;

        return position;
    }

    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position " + scorePosition);
    }

}
