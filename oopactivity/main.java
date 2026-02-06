package oopactivity;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        subclasss op = null;
        boolean continueProgram = true;

        do {
            System.out.println("\nOOP Activity");
            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("5: Rect Area");
            System.out.println("6: Circle Area");
            System.out.println("7: Even/Odd Check");
            System.out.print("Select: ");
            int choice = sc.nextInt();

            // Instantiate the correct class
            if (choice == 1) op = new Addition();
            else if (choice == 2) op = new Subtraction();
            else if (choice == 3) op = new Multiplication();
            else if (choice == 4) op = new Division();
            else if (choice == 5) op = new RectangleArea();
            else if (choice == 6) op = new CircleArea();
            else if (choice == 7) op = new EvenOddCheck();

            if (op != null) {
                if (choice == 5) {
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();
                    op.setValues(length, width);
                    double result = op.calculate();
                    System.out.println("Formula: Area = length * width");
                    System.out.println("Calculation: " + length + " * " + width + " = " + result);
                } else if (choice == 6) {
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    op.setValues(radius, 0);
                    double result = op.calculate();
                    System.out.println("Formula: Area = π * radius²");
                    System.out.println("Calculation: 3.14159 * " + radius + "² = " + result);
                } else if (choice == 7) {
                    System.out.print("Enter value: ");
                    op.setValues(sc.nextDouble(), 0);
                    double result = op.calculate();
                    System.out.println("Result: " + (result == 1 ? "Even" : "Odd"));
                } else {
                    System.out.print("Enter two values: ");
                    op.setValues(sc.nextDouble(), sc.nextDouble());
                    double result = op.calculate();
                    System.out.println("Result: " + result);
                }
            }

            System.out.print("Continue? (y/n): ");
            continueProgram = sc.next().equalsIgnoreCase("y");

        } while (continueProgram);

        sc.close();
    }
}