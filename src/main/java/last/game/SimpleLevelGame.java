package last.game;

public class SimpleLevelGame extends ComputerIntelligence {

    @Override
    public int computerTurn (int stones) {
        int computerTurn = (int) (Math.random() * 3 + 1);
        return stones - computerTurn;
    }
}
