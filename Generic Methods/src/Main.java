/**
 * Class to test the functionality of the GenericUtils class methods.
 *
 * @author Clarissa Czipin
 * @version 2025-02-19
 */
public class Main {

    /**
     * Main method to test the reverse and sum methods with different array types.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Integer array: ");
        printArray(intArray);  // Expected output: 1 2 3 4 5

        GenericUtils.reverse(intArray);

        System.out.println("Reversed Integer array: ");
        printArray(intArray);  // Expected output: 5 4 3 2 1

        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5};
        double sum = GenericUtils.sum(doubleArray);
        System.out.println("Sum of Double array: " + sum);  // Expected output: 12.0
        
        Float[] floatArray = {1.0f, 2.0f, 3.0f};
        double floatSum = GenericUtils.sum(floatArray);
        System.out.println("Sum of Float array: " + floatSum);  // Expected output: 6.0
    }

    /**
     * Helper method to print the contents of an array.
     *
     * @param array the array to be printed
     * @param <T> the type of the array elements
     */
    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
