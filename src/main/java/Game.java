import java.util.Scanner;

public class Game {
    public String inputPlayer1 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a symbol: ");
        String symbol = scanner.next();
        return symbol;
    }

    public String inputPlayer2 () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a symbol: ");
        String symbol = scanner.next();
        return symbol;
    }

    public void calculateWinner(String player1, String player2) {
        if (player1.equals(player2)) {
            System.out.println("Draw!!!");
        } else {
            if ((player1.equals("Scissors") && player2.equals("Paper")) ||
                    (player1.equals("Paper") && player2.equals("Stone")) ||
                    (player1.equals("Stone") && player2.equals("Scissors"))) {
                System.out.println("Player1 won");
            } else {
                System.out.println("Player2 won");
            }
        }
    }
}
