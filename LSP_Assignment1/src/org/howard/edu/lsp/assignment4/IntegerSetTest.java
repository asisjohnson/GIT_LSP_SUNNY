package org.howard.edu.lsp.assignment4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class IntegerSetTest {
	
	private IntegerSet integerSet;

	@BeforeEach
    public void setUp() {
        integerSet = new IntegerSet();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        integerSet.clear();
        assertTrue(integerSet.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(3, integerSet.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(1);
        otherSet.add(2);
        otherSet.add(3);
        assertTrue(integerSet.equals(otherSet));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        assertTrue(integerSet.contains(2));
        assertFalse(integerSet.contains(4));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        assertEquals(3, integerSet.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        assertEquals(1, integerSet.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        integerSet.add(4);
        assertTrue(integerSet.contains(4));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        integerSet.remove(2);
        assertFalse(integerSet.contains(2));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(2);
        otherSet.add(4);
        integerSet.union(otherSet);
        assertTrue(integerSet.contains(4));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(2);
        otherSet.add(3);
        integerSet.intersect(otherSet);
        assertFalse(integerSet.contains(1));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(2);
        otherSet.add(3);
        integerSet.diff(otherSet);
        assertTrue(integerSet.contains(1));
        assertFalse(integerSet.contains(2));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(1);
        otherSet.add(2);
        otherSet.add(3);
        otherSet.add(4);
        integerSet.complement(otherSet);
        assertTrue(integerSet.isEmpty());
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertFalse(integerSet.isEmpty());
        integerSet.clear();
        assertTrue(integerSet.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        assertEquals("[1, 2, 3]", integerSet.toString());
    }

    @Test
    @DisplayName("Test case for largest when set is empty (Exception)")
    public void testLargestException() {
        integerSet.clear();
        assertThrows(IntegerSet.IntegerSetException.class, () -> integerSet.largest());
    }

    @Test
    @DisplayName("Test case for smallest when set is empty (Exception)")
    public void testSmallestException() {
        integerSet.clear();
        assertThrows(IntegerSet.IntegerSetException.class, () -> integerSet.smallest());
    }

}
