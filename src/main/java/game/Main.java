package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Message.TYPE_STONES_NUMBER);
        Scanner scanner = new Scanner(System.in);
        String stonesInput = scanner.next();
        while (!stonesInput.matches("^[0-9]{2}$")) {
            System.out.println(Message.INVALID_INPUT);
            stonesInput = scanner.next();
        }

        int stones = Integer.parseInt(stonesInput);
        Engine engine = new Engine(stones);
        engine.launchGame();

    }
}
