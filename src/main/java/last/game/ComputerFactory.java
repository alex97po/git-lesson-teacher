package last.game;

public class ComputerFactory {

    public static ComputerIntelligence createComputer (int level) {
        if (level == 1) {
            return new SimpleLevelGame();
        } else {
            return new HardLevelGame();
        }
    }
}
