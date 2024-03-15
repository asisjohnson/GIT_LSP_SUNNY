package org.howard.edu.lsp.midterm.question1;

/**
 * Provides encryption operations.
 */
public class SecurityOps {
    /**
     * Encrypts the given text by rearranging characters.
     *
     * @param text the text to encrypt
     * @return the encrypted text
     */
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();

        // Append even-indexed characters
        for (int i = 0; i < text.length(); i += 2) {
            if (Character.isLetterOrDigit(text.charAt(i))) {
                encryptedText.append(text.charAt(i));
            }
        }

        // Append odd-indexed characters
        for (int i = 1; i < text.length(); i += 2) {
            if (Character.isLetterOrDigit(text.charAt(i))) {
                encryptedText.append(text.charAt(i));
            }
        }

        return encryptedText.toString();
    }
}