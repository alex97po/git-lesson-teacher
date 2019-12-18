package game;

import java.util.Scanner;

public class Player {

    public int playerMove () {
        System.out.println(Message.ASK_PLAYER_NUNBER_OF_STONES);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!input.matches("^[1-3]$")) {
            System.out.println(Message.INVALID_INPUT);
            input = scanner.next();
        }
        return Integer.parseInt(input);
    }
}
