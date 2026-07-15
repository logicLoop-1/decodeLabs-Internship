package NumberGame;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreTracker scoreTracker = new ScoreTracker();
        boolean playAgain = true;
        System.out.println("------------------------------------");
        System.out.println("      WELCOME TO THE NUMBER GAME");
        System.out.println("------------------------------------");
        while (playAgain) {
            NumberGuessGame game = new NumberGuessGame(1, 100);
            System.out.println("\nI'm thinking of a number between "
                    + game.getMin() + " and " + game.getMax() + ".");
            boolean guessedCorrectly = false;
            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("That's not a valid number. Try again.");
                    scanner.next();
                    continue;
                }
                int guess = scanner.nextInt();
                String result = game.checkGuess(guess);
                if (result.equals("CORRECT")) {
                    System.out.println("Correct! You guessed it in "
                            + game.getAttempts() + " attempts.");
                    guessedCorrectly = true;
                } else if (result.equals("TOO_HIGH")) {
                    System.out.println("Too high! Try again.");
                } else if (result.equals("TOO_LOW")) {
                    System.out.println("Too low! Try again.");
                }
            }
            scoreTracker.recordRound(game.getAttempts());
            System.out.print("\nPlay another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");
        }
        scoreTracker.printSummary();
        System.out.println("\nThanks for playing!");
        scanner.close();
    }
}