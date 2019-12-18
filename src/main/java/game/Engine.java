package game;

import java.util.Scanner;

public class Engine {
    int stones = 12;
    int level;

    public void launchGame () {
        makePlayerToChooseLevel();
        gameProcess(level);
    }

    public void makePlayerToChooseLevel () {
        System.out.println(Message.ASK_PLAYER_TO_CHOOSE_LEVEL);
        System.out.println(Message.LEVEL_EASY);
        System.out.println(Message.LEVEL_HARD);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!input.matches("^[1-2]$")) {
            System.out.println(Message.INVALID_INPUT);
            input = scanner.next();
        }
        level = Integer.parseInt(input);
    }

    public void gameProcess (int level) {
        Player player = new Player();
        ComputerFactory factory = new ComputerFactory();
        Computer computer = factory.createComputer(level);
        computer.computerMove();
    }
}
