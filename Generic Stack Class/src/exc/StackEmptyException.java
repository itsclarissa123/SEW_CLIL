package exc;
/**
 * Exception thrown when trying to pop or peek from an empty stack.
 */
public class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}