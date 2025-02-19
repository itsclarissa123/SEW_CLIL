import exc.*;

/**
 * Test class for Stack implementation.
 * Demonstrates the functionality of the stack with both Integer and String types.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Testing Integer Stack
            Stack<Integer> intStack = new Stack<>();
            System.out.println("Testing Integer Stack:");

            intStack.push(10);
            intStack.push(20);
            intStack.push(30);
            System.out.println("Stack contents: " + intStack.list()); // Expected: 10;20;30

            System.out.println("Peek: " + intStack.peek()); // Expected: 30
            System.out.println("Popped: " + intStack.pop()); // Expected: 30
            System.out.println("Stack after pop: " + intStack.list()); // Expected: 10;20

            // Testing boundary conditions
            for (int i = 0; i < 8; i++) {
                intStack.push(i * 10);
            }
            System.out.println("Stack after filling up: " + intStack.list());

            try {
                intStack.push(100); // Should throw StackFullException
            } catch (StackFullException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            while (!intStack.isEmpty()) {
                System.out.println("Popped: " + intStack.pop());
            }

            try {
                intStack.pop(); // Should throw StackEmptyException
            } catch (StackEmptyException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            // Testing String Stack
            Stack<String> stringStack = new Stack<>();
            System.out.println("\nTesting String Stack:");

            stringStack.push("Alpha");
            stringStack.push("Beta");
            stringStack.push("Gamma");
            System.out.println("Stack contents: " + stringStack.list()); // Expected: Alpha;Beta;Gamma

            System.out.println("Peek: " + stringStack.peek()); // Expected: Gamma
            System.out.println("Popped: " + stringStack.pop()); // Expected: Gamma
            System.out.println("Stack after pop: " + stringStack.list()); // Expected: Alpha;Beta

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}