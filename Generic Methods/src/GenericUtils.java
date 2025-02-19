/**
 * Utility class that provides generic methods for arrays.
 * @author Clarissa Czipin
 * @version 2025-02-19
 */
public class GenericUtils {

    /**
     * Reverses the elements of the given array in place.
     *
     * @param array the array to be reversed
     * @param <T> the type of the array elements
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Calculates the sum of elements in the array. This method works only for arrays
     * of types that extend from java.lang.Number (e.g., Integer, Double, Float).
     *
     * @param array the array of numbers to be summed
     * @param <T> the type of the elements in the array, which must extend Number
     * @return the sum of all the elements in the array as a double
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0.0;

        for (T number : array) {
            sum += number.doubleValue();
        }

        return sum;
    }
}
