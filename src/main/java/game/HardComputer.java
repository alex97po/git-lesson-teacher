package game;

public class HardComputer extends Computer {

    @Override
    public int computerMove(int stones) {
        return stones - stones % 4;
    }
}

