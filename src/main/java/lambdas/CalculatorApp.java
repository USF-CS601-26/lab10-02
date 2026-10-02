package lambdas;

import java.util.Scanner;

public class CalculatorApp {
    static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setUp();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (!name.equals("q")) {
            System.out.println("Enter the name of the arithmetic operation (add, subtract, multiply, divide, modulus) or q to exit: ");
            name = scanner.nextLine();
            if (name.equals("q"))
                break;
            System.out.println("Enter a: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter b: ");
            double b = Double.parseDouble(scanner.nextLine());
            ArithmeticOperation op = calc.getOperation(name);
            if (op != null) {
                double result = op.execute(a, b);
                System.out.println("Result (not accumulative): " + result);
            } else {
                System.out.println("Invalid operation. Try again.");
            }
        }
        scanner.close();
    }
}
