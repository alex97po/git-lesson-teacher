package last.game;

public class HardLevelGame extends ComputerIntelligence {

    @Override
    int computerTurn(int stones) {
        int computerMove = stones % 4;
        return stones - computerMove;
    }
}
