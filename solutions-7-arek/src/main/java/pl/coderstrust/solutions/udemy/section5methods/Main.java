package pl.coderstrust.solutions.udemy.section5methods;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        calculateScore(gameOver,score, levelCompleted, bonus);
        System.out.println(calculateScore(false,10000,8,200));

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);


        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);


        highScorePosition = calculateHighScorePosition(300);
        displayHighScorePosition("Percy",highScorePosition);


        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition )
        {
           System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");

        }

    public static int calculateHighScorePosition(int score){
//        if (score >= 1000) {
//            return 1;}
//        else if (score > 500) {
//            return 2;}
//        else if (score > 100) {
//            return 3;}
//        return 4;
        int position = 4;

        if (score >= 1000){
            position = 1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }

        return  position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore =-1;
        if (gameOver){
            finalScore = score + (levelCompleted*bonus);
            finalScore +=1000;
            System.out.println("Your final score was "+ finalScore);
            return finalScore;
        }
        return finalScore;
    }


}
