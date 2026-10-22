import java.rmi.*;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Calculator obj = (Calculator)
                    Naming.lookup("rmi://localhost/CalculatorService");

            int a = 20, b = 10;

            System.out.println("Addition: " + obj.add(a, b));
            System.out.println("Subtraction: " + obj.subtract(a, b));
            System.out.println("Multiplication: " + obj.multiply(a, b));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}