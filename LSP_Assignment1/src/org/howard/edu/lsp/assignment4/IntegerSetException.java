package org.howard.edu.lsp.assignment4;


/**
 * Custom exception class for IntegerSet.
 * Thrown when an operation cannot be performed on an empty set.
 */
public class IntegerSetException extends RuntimeException {
    /**
     * Constructs a new IntegerSetException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the getMessage() method).
     */
    public IntegerSetException(String message) {
        super(message);
    }
}