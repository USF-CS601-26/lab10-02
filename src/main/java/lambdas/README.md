# Lambda Expressions Exercise

In this exercise, you will practice using **lambda expressions** with a functional interface.

The program defines the following interface:

```java
@FunctionalInterface
public interface ArithmeticOperation {
    double execute(double a, double b);
}
```

Since `ArithmeticOperation` has exactly one abstract method, it can be implemented using a lambda expression.

## Your Task

Open the `Calculator` class and complete the `setUp()` method.

Add the following operations:

- `add`
- `subtract`
- `multiply`
- `divide`
- `modulus`

For each operation, call `addOperation(...)` and pass:

1. The name of the operation as a string.
2. A lambda expression that implements the corresponding arithmetic operation.

For example, the general form is:

For example, the general form is:
```java
addOperation("operationName", (a, b) -> ...);
```

Do not create separate classes for the arithmetic operations. Use lambda expressions.

## Running the Program

Run CalculatorApp.  The program will ask you to enter the name of an arithmetic operation and two numbers.

For example:

Enter the name of the arithmetic operation (add, subtract, multiply, divide, modulus) or q to exit:
add

Enter a:
10

Enter b:
5

Result: 15.0

You can continue entering operations until you enter q.