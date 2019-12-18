package game;

import java.util.Scanner;

public class Engine {
    public static int stones;
    int level;

    Engine(int stones) {
        this.stones = stones;
    }

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
        boolean isComputerWin = false;
        while (stones > 0) {
            System.out.println(Message.COMPUTER_MOVE);
            stones = computer.computerMove(stones);
            if (stones <= 0) {
                isComputerWin = true;
                break;
            }
            System.out.println(Message.STONES_LEFT + stones);
            stones -= player.playerMove();
        }

        System.out.println(isComputerWin ? Message.COMPUTER_WIN : Message.PLAYER_WIN);
    }
}
