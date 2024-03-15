package org.howard.edu.lsp.midterm.question1;

/**
 * Test class for SecurityOps.
 */
public class Driver {
    /**
     * Main method to test the encryption operation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String input = "I love CSCI363";
        String encryptedText = SecurityOps.encrypt(input);
        System.out.println("Encrypted text: " + encryptedText);
    }
}
