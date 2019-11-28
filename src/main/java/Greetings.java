import java.util.Scanner;

public class Greetings {
    public void askForName() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        printText(name);
    }

    private void printText (String input) {
        if (input == "Sasha") {
            System.out.println("Hello, teacher!");
        } else {
            System.out.println("Hello, student!");
        }
    }
}
