package org.howard.edu.lsp.assignment4;

/**
*  Name: Asis Johnson
*/


public class Driver {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());
        System.out.println("Checks if 1 is in the set: " + set1.contains(1));
        System.out.println("Checks if 6 is in the set: " + set1.contains(6));
        System.out.println("Checks if the set is empty: " + set1.isEmpty());

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Value of Set2 is: " + set2.toString());

        System.out.println("Union of Set1 and Set2:");
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

        System.out.println("Intersection of Set1 and Set2:");
        set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());

        System.out.println("Difference of Set1 and Set2:");
        IntegerSet set3 = new IntegerSet();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.diff(set2);
        System.out.println("Result of difference of Set3 and Set2: " + set3.toString());

        System.out.println("Complement of Set1 and Set2:");
        set2.complement(set1);
        System.out.println("Result of complement of Set2 and Set1: " + set1.toString());
        
        set3.remove(3);
        System.out.println("Removed 3 from Set 3: " + set3.toString());
        
        System.out.println("Length of Set 3: " + set3.length());        
        
        set3.clear();
        System.out.println("Clear Set 3: " + set3.toString());
        
        System.out.println("Check smallest in empty Set 3: " + set3.smallest());
    }
}