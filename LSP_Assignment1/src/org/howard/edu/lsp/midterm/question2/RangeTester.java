package org.howard.edu.lsp.midterm.question2;

/**
 * Class for testing the IntegerRange class.
 */
public class RangeTester {
    public static void main(String[] args) {
        // Create two integer ranges
        IntegerRange range1 = new IntegerRange(1, 5);
        IntegerRange range2 = new IntegerRange(3, 7);

        // Test contains method
        System.out.println("Range 1 contains 3: " + range1.contains(3)); // Should print true
        System.out.println("Range 2 contains 8: " + range2.contains(8)); // Should print false

        // Test overlaps method
        System.out.println("Ranges overlap: " + range1.overlaps(range2)); // Should print true

        // Test size method
        System.out.println("Size of range 1: " + range1.size()); // Should print 5

        // Test equals method
        System.out.println("Ranges are equal: " + range1.equals(range2)); // Should print false
        IntegerRange range3 = new IntegerRange(1, 5);
        System.out.println("Ranges are equal: " + range1.equals(range3)); // Should print true
    }
}
