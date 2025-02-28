import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;

        System.out.println("Discriminant (D) = " + D);

        if (D > 0) {
            System.out.println("The equation has two real and distinct roots.");
            
        } else if (D == 0) {
            System.out.println("The equation has one real and repeated root.");
    
        } 
        else {
            System.out.println("The equation has two complex roots.");
           
        }

        scanner.close();
    }
}