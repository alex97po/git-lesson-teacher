package last.game;

import java.util.Scanner;

public class GameEngine {
    private static int stones = 15;

    private void playerTurn() {
        System.out.println(Messages.ASK_PLAYER_TO_MOVE);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!input.matches("^[1-3]$")) {
            System.out.println(Messages.WRONG_INPUT);
            input = scanner.next();
        }

        int playerMove = Integer.parseInt(input);
        stones -= playerMove;
        System.out.println(Messages.STONES_REMAIN + stones);
    }

    private void engine(ComputerIntelligence computer) {
        boolean isPayersMove = true;

        while (stones > 0) {
            if (isPayersMove) {
                playerTurn();
                isPayersMove = false;
            } else {
                System.out.println(Messages.COMPUTER_TURN);
                stones = computer.computerTurn(stones);
                System.out.println(Messages.STONES_REMAIN + stones);
                isPayersMove = true;
            }
        }

        System.out.println(isPayersMove ? "Computer win" : "Player win");
    }

    void launchGame() {
        System.out.println(Messages.WELCOME_AND_CHOOSE_LEVEL);
        System.out.println(Messages.LEVEL_1);
        System.out.println(Messages.LEVEL_2);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!input.matches("^[1-2]$")) {
            System.out.println(Messages.WRONG_INPUT);
            input = scanner.next();
        }
        int level = Integer.parseInt(input);

        ComputerIntelligence computer = ComputerFactory.createComputer(level);
        engine(computer);
    }
}
