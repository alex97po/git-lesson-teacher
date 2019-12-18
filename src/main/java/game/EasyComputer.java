package game;

public class EasyComputer extends Computer {

    @Override
    public int computerMove (int stones) {
        return stones - (int) (Math.random() * 3 + 1);
    }

}
