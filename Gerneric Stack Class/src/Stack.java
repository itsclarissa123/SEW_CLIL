import exc.StackEmptyException;
import exc.StackFullException;

/**
 * A generic stack implementation using an array.
 * Implements Last-In-First-Out (LIFO) principle.
 * Supports push, pop, peek, and listing all elements.
 */
public class Stack<T> {
    private Object[] elements;
    private static final int MAXSIZE = 10;
    private int top;

    /**
     * Default constructor initializing stack with fixed size.
     */
    public Stack() {
        elements = new Object[MAXSIZE];
        top = -1;
    }

    /**
     * Pushes an element onto the stack.
     * @param element Element to be added
     * @throws StackFullException if the stack is full
     */
    public void push(T element) throws StackFullException {
        if (top == MAXSIZE - 1) {
            throw new StackFullException("Stack is full");
        }
        elements[++top] = element;
    }

    /**
     * Removes and returns the top element of the stack.
     * @return Top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top--];
    }

    /**
     * Returns the top element of the stack without removing it.
     * @return Top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top];
    }


    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Checks if the stack is full.
     * @return true if the stack is full, false otherwise
     */
    public boolean isFull() {
        return top == MAXSIZE - 1;
    }

    /**
     * Returns a string representation of all elements in the stack.
     * Elements are separated by a semicolon (;).
     * @return String representation of stack contents
     */
    public String list() {
        if (isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]).append(";");
        }
        return sb.substring(0, sb.length() - 1);
    }
}