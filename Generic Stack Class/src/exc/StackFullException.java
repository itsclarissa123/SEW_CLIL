package exc;

/**
 * Exception thrown when trying to push onto a full stack.
 */
public class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}

