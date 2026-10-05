import java.util.Scanner;

public class test27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30};

        try {
            System.out.print("Enter numerator index (0-2): ");
            int idx = sc.nextInt();
            int numerator = numbers[idx]; 
            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();
            int result = numerator / divisor; 
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}