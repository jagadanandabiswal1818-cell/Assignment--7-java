import mathoperations.Calculator;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double x = 12.0;
        double y = 4.0;

        System.out.println("Addition: " + calc.add(x, y));
        System.out.println("Subtraction: " + calc.subtract(x, y));
        System.out.println("Multiplication: " + calc.multiply(x, y));
        System.out.println("Division: " + calc.divide(x, y));
    }
}