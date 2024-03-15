package org.howard.edu.lsp.midterm.question2;

/**
 * Interface representing a range of integers.
 */
public interface Range {
    /**
     * Checks if the range contains a given value.
     * @param value the value to check
     * @return true if the value is within the range, otherwise false
     */
    boolean contains(int value);

    /**
     * Checks if the range overlaps with another range.
     * @param other the other range to check for overlap
     * @return true if there is overlap, otherwise false
     */
    boolean overlaps(Range other);

    /**
     * Gets the number of integers in the range.
     * @return the size of the range
     */
    int size();
}
