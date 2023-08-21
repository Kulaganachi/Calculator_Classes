
public class Main {
    public static void main(String[] args) {
        // Create an Adder object
        Adder adder = new Adder();

        // Input
        int a = 7; // Sample input
        int b = 4; // Sample input

        // Testing addition
        System.out.println("Testing Addition");
        int sum = adder.add(a, b);
        System.out.println("Sum = " + sum);

        // Testing multiplication
        Multiplier multiplier = new Multiplier();
        System.out.println("Testing Multiplication");
        int product = multiplier.multiply(a, b, adder);
        System.out.println("Product = " + product);
    }
}
// Abstract class Calculator containing the abstract add method.
abstract class Calculator {
    abstract int add(int a, int b);
}

// Adder class extending Calculator and implementing the add method.
class Adder extends Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("Adding integers: " + a + " " + b);
        return a + b;
    }
}

// Multiplier class containing the multiply method which uses the Adder class to perform multiplication through repeated addition.
class Multiplier {

    public int multiply(int a, int b, Calculator calculator) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = calculator.add(result, a);
        }
        return result;
    }
}

// Solution class to test the Adder and Multiplier implementations.
