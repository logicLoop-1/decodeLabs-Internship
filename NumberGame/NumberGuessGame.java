package NumberGame;
import java.util.Random;
public class NumberGuessGame {
    private int min;
    private int max;
    private int targetNumber;
    private int attempts;
    public NumberGuessGame(int min, int max) {
        this.min = min;
        this.max = max;
        this.attempts = 0;
        Random random = new Random();
        this.targetNumber = random.nextInt(max - min + 1) + min;
    }
    public String checkGuess(int guess) {
        attempts++;
        if (guess == targetNumber) {
            return "CORRECT";
        } else if (guess > targetNumber) {
            return "TOO_HIGH";
        } else {
            return "TOO_LOW";
        }
    }
    public int getAttempts() {
        return attempts;
    }
    public int getMin() {
        return min;
    }
    public int getMax() {
        return max;
    }
}