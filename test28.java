public class test28 {
    public static void checkDivision(int a, int b) {
        try {
            System.out.println("\n--- Attempting division: " + a + " / " + b + " ---");
            int result = a / b;
            System.out.println("Operation succeeded. Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed regardless of exception occurrence.");
        }
    }

    public static void main(String[] args) {
        
        checkDivision(10, 2);

        checkDivision(10, 0);
    }
}