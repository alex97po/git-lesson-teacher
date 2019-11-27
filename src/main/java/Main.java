public class Main {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        double height = bmi.inputHeight();
        int weight = bmi.inputWeight();
        double index = bmi.calculate(height, weight);
        bmi.outputResult(index);
    }


}
