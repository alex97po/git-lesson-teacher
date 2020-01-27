import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    //To launch game
//    public static void main(String[] args) {
//        Game game = new Game();
//        String player1 = game.inputPlayer1();
//        String player2 = game.inputPlayer2();
//        game.calculateWinner(player1, player2);
//    }

    static int i;

    //To launch BMI
    public static void main (String[] args) {
//        BMI index = new BMI();
//        double height = index.inputHeight();
//        int weight = index.inputWeight();
//        double bmi = index.calculate(height, weight);
//        index.outputResult(bmi);



    }

    public static void recur (int a) {
        if (a <=100) {
            System.out.println(a);
            recur(++a);
            System.out.println(a);
        }
    }

    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
        return Arrays.stream(citiesOffered)
                .filter(city -> !Arrays.stream(citiesVisited).collect(Collectors.toList()).contains(city))
                .findFirst().orElse("No worthwhile conferences this year!");
    }
}
