package game;

public class ComputerFactory {

    public Computer createComputer(int level) {
        if (level == 1) {
            return new EasyComputer();
        } else {
            return new HardComputer();
        }
    }

}
