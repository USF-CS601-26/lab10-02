package lambdas;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    // Maps the name of the arithmetic operation to the actual operation
    private Map<String, ArithmeticOperation> calcOperations;

    public Calculator() {
        calcOperations= new HashMap<>();
    }

    /**
     * Adds the name of the operation such as "add" to the actual implementation
     * @param name
     * @param implementation
     */
    public void addOperation(String name, ArithmeticOperation implementation) {
        calcOperations.put(name, implementation);
    }

    /**
     * Returns the operation based on the name
     * @param name
     * @return
     */
    public ArithmeticOperation getOperation(String name) {
        return calcOperations.get(name);
    }

    public void setUp() {
        // Call addOperation for "add", "subtract", "multiply", "divide", and "modulus".
        // For each operation, pass a lambda expression that implements the ArithmeticOperation functional interface.
        // TODO:

    }
}
