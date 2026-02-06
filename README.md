
(main - decides what to display in the console, responsible for handling the commands)
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

(subclass - the template of the code, handles the assigned operation and values of each variable)
package oopactivity;

//using hierarchical inheritance structure, the subclasses addition, subtraction, multiplication, division, area and number theory all branch out from the main class
public class subclasss {
 //private encapsulation to secure the valuse of both v1 and v2
    private double v1, v2;

    public void setValues(double a, double b) {
        this.v1 = a;
        this.v2 = b;
    }
//public encapsulation so the main class can access these values
    public double getV1() { return v1; }
    public double getV2() { return v2; }

    public double calculate() { return 0; }
}


class Addition extends subclasss {
    public double calculate() { return getV1() + getV2(); }
}
class Subtraction extends subclasss {
    public double calculate() { return getV1() - getV2(); }
}
class Multiplication extends subclasss {
    public double calculate() { return getV1() * getV2(); }
}
class Division extends subclasss {
    public double calculate() {
        if (getV2() == 0) {
            System.out.println("Math Error: Cannot divide by zero");
            return 0;
        }
        return getV1() / getV2();
    }
}

class RectangleArea extends subclasss {
    public double calculate() { return getV1() * getV2(); }
}
class CircleArea extends subclasss {
    public double calculate() { 
        return 3.14159 * (getV1() * getV1()); 
    }
}

class EvenOddCheck extends subclasss {
    public double calculate() { 
        // Returns 1 for Even, 0 for Odd
        return (getV1() % 2 == 0) ? 1 : 0; 
    }
}

console result example:
OOP Activity
1. addition
2. subtraction
3. multiplication
4. division
5: Rect Area
6: Circle Area
7: Even/Odd Check
Select: 5
Enter length: 5
Enter width: 9
Formula: Area = length * width
Calculation: 5.0 * 9.0 = 45.0
Continue? (y/n): y

OOP Activity
1. addition
2. subtraction
3. multiplication
4. division
5: Rect Area
6: Circle Area
7: Even/Odd Check
Select: 6
Enter radius: 9
Formula: Area = π * radius²
Calculation: 3.14159 * 9.0² = 254.46878999999998
Continue? (y/n): y

OOP Activity
1. addition
2. subtraction
3. multiplication
4. division
5: Rect Area
6: Circle Area
7: Even/Odd Check
Select: 1
Enter two values: 3
4
Result: 7.0
Continue? (y/n): y

OOP Activity
1. addition
2. subtraction
3. multiplication
4. division
5: Rect Area
6: Circle Area
7: Even/Odd Check
Select: 2
Enter two values: 54
75
Result: -21.0
Continue? (y/n): y

OOP Activity
1. addition
2. subtraction
3. multiplication
4. division
5: Rect Area
6: Circle Area
7: Even/Odd Check
Select: 3
Enter two values: 6
7
Result: 42.0
Continue? (y/n): y

OOP Activity
1. addition
2. subtraction
3. multiplication
4. division
5: Rect Area
6: Circle Area
7: Even/Odd Check
Select: 4
Enter two values: 5
6
Result: 0.8333333333333334
Continue? (y/n): y

OOP Activity
1. addition
2. subtraction
3. multiplication
4. division
5: Rect Area
6: Circle Area
7: Even/Odd Check
Select: 6
Enter radius: 54
Formula: Area = π * radius²
Calculation: 3.14159 * 54.0² = 9160.87644
Continue? (y/n): y

OOP Activity
1. addition
2. subtraction
3. multiplication
4. division
5: Rect Area
6: Circle Area
7: Even/Odd Check
Select: 7
Enter value: 56
Result: Even
