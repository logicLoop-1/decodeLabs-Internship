package NumberGame;
import java.util.ArrayList;

public class ScoreTracker {
    private ArrayList<Integer> attemptsPerRound;
    public ScoreTracker() {
        this.attemptsPerRound = new ArrayList<>();
    }
    public void recordRound(int attempts) {
        attemptsPerRound.add(attempts);
    }
    public void printSummary() {
        System.out.println("\n------------------------------------");
        System.out.println("             FINAL SCORE");
        System.out.println("------------------------------------");
        int roundsPlayed = attemptsPerRound.size();
        System.out.println("Rounds played: " + roundsPlayed);
        for (int i = 0; i < roundsPlayed; i++) {
            System.out.println("Round " + (i + 1) + ": "
                    + attemptsPerRound.get(i) + " attempts");
        }
        int best = findBestRound();
        if (best != -1) {
            System.out.println("Best round: " + best + " attempts");
        }
    }
    private int findBestRound() {
        if (attemptsPerRound.isEmpty()) {
            return -1;
        }
        int best = attemptsPerRound.get(0);
        for (int attempts : attemptsPerRound) {
            if (attempts < best) {
                best = attempts;
            }
        }
        return best;
    }
}