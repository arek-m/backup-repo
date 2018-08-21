package pl.coderstrust.solutions.udemy.methodOverloading;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println("13 ft 0 in is equal to " + calcFeetAndInchesToCentimeters(13, 0) + "cm.");
        System.out.println("156 inches equals to " + calcFeetAndInchesToCentimeters(156) + "cm." );
        System.out.println(" -1 feet -1 inch equals to " + calcFeetAndInchesToCentimeters(-1,-1));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player name, no player score.");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeters(int feets, int inches) {
        double centimeters = 0d;
        if (feets >= 0 && inches >= 0 && inches <= 12) {
            centimeters = (double) (feets * 12 + inches) * 2.54d;
            return centimeters;
        } else {
            System.out.println("Error! Check again Your values");
            return -1;
            //System.out.println("Error! check again Your values");
        }

    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        double centimeters = 0d;
        if (inches >= 0) {
            centimeters = calcFeetAndInchesToCentimeters(inches / 12, inches % 12);
            return centimeters;
        } else {
            System.out.println("Error! Check again Your values");
            return -1;

        }
    }
}