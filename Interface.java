interface Calculator {
    int add(int a, int b);       // Method for addition
    int subtract(int a, int b);  // Method for subtraction
    int multiply(int a, int b);  // Method for multiplication
    double divide(int a, int b); // Method for division
}

// Implement the Calculator interface
class BasicCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return (double) a / b;
    }
}

public class Interface{
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();

        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);
        int product = calc.multiply(10, 5);
        double quotient = calc.divide(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        {
            double invalid = calc.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}