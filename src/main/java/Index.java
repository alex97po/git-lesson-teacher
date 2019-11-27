import java.util.Scanner;

public class Index {

    public double height;

    public double inputHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your height:");
        double height = scanner.nextDouble();
        return height;
    }

    public int inputWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your weight:");
        int weight = scanner.nextInt();
        return weight;


    }


   /* public double calculate (double height_1, int weight_1) {
        double IMT = weight_1 / Math.pow(height_1, 2);
        return double IMT;
    }

}
    public void outputResult (double result) {
        if (result <= 18.5) {
            System.out.println("Underweihgt");
        }
        if (result <= 25.5) {
            System.out.println("Normal");
        }
        if (result <= 30.5) {
            System.out.println("Overweihgt");
        }
        else {
            System.out.println("Else");
        }
                                 */

}

