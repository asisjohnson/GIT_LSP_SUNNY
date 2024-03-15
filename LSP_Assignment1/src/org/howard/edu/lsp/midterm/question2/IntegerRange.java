package org.howard.edu.lsp.midterm.question2;

/**
 * Class representing an integer range with lower and upper bounds.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an IntegerRange with given lower and upper bounds.
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if a given value is within the range.
     * @param value the value to check
     * @return true if the value is within the range, otherwise false
     */
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * Checks if the range overlaps with another range.
     * @param other the other range to check for overlap
     * @return true if there is overlap, otherwise false
     */
    @Override
    public boolean overlaps(Range other) {
        return this.contains(((IntegerRange) other).lowerBound) ||
               this.contains(((IntegerRange) other).upperBound);
    }

    /**
     * Gets the number of integers in the range.
     * @return the size of the range
     */
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Checks if two ranges are equal.
     * Two ranges are equal if their lower and upper bounds are the same.
     * @param obj the object to compare
     * @return true if the ranges are equal, otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }
}
