package org.howard.edu.lsp.assignment4;

/**
*  Name: Asis Johnson
*/


import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers.
 */
public class IntegerSet {
	/**
     * Store the set elements in an ArrayList
     */
    private List<Integer> set = new ArrayList<>();
    
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

    /**
     * Default constructor for IntegerSet.
     */
    public IntegerSet() {
    }

    /**
     * Constructor that initializes IntegerSet with provided set of integers.
     * @param set The set of integers to initialize IntegerSet.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return The number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if two IntegerSet objects are equal.
     * Two sets are equal if they contain all of the same values in any order.
     * @param o The object to compare.
     * @return true if the sets are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet that = (IntegerSet) o;
        return set.containsAll(that.set) && that.set.containsAll(set);
    }

    /**
     * Checks if the set contains a specified value.
     * @param value The value to check for.
     * @return true if the set contains the value, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Finds the largest element in the set.
     * @return The largest element in the set.
     * @throws IntegerSetException if the set is empty.
     */
    public int largest()
    		throws IntegerSetException {
    	if (set.isEmpty())
    		throw new IntegerSetException("Cannot find largest element in an empty set.");
        int max = set.get(0);
        for (int num : set) {
            if (num > max)
                max = num;
        }
        return max;
    }

    /**
     * Finds the smallest element in the set.
     * @return The smallest element in the set.
     * @throws IntegerSetException if the set is empty.
     */
    public int smallest()
    		throws IntegerSetException {
    	if (set.isEmpty())
    		throw new IntegerSetException("Cannot find smallest element in an empty set.");
        int min = set.get(0);
        for (int num : set) {
            if (num < min)
                min = num;
        }
        return min;
    }

    /**
     * Adds an element to the set if it is not already present.
     *
     * @param item The element to add to the set.
     */
    public void add(int item) {
        if (!set.contains(item))
            set.add(item);
    }

    /**
     * Removes an element from the set if it is present.
     *
     * @param item The element to remove from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs set union operation with another IntegerSet.
     *
     * @param intSetb The IntegerSet to perform union with.
     */
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            if (!set.contains(num))
                set.add(num);
        }
    }

    /**
     * Performs set intersection operation with another IntegerSet.
     *
     * @param intSetb The IntegerSet to perform intersection with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs set difference operation with another IntegerSet.
     *
     * @param intSetb The IntegerSet to perform difference with.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Computes the complement of the set with respect to another IntegerSet.
     *
     * @param intSetb The IntegerSet to compute complement with.
     */
    public void complement(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            set.remove(Integer.valueOf(num));
        }
    }

    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     *
     * @return A string representation of the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }
}