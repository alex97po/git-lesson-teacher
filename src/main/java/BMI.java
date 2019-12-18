import java.util.Scanner;

public class BMI {

    public double inputHeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your height: ");
        while(!scanner.hasNextDouble()) {
            System.out.println("Invalid value. Type your height: ");
            scanner.next();
        }
        double height = scanner.nextDouble();
        return height;
    }

    public int inputWeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your weight: ");
        int weight = scanner.nextInt();
        return weight;
    }

    public double calculate (double height, int weight) {
        return weight / Math.pow(height, 2);
    }

    public void outputResult(double result) {
        if (result <= 18.5) {
            System.out.println("Underweight");
        } else if (result <= 25.0) {
            System.out.println("Normal");
        } else if (result <= 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
