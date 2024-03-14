package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public static String encrypt(String text) {
        // Initialize two StringBuilder objects for even and odd characters
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        // Iterate through each character in the input text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if the character is a letter or digit (ignore punctuation and whitespace)
            if (Character.isLetterOrDigit(c)) {
                // Append even-indexed characters to evenChars StringBuilder
                if (i % 2 == 0) {
                    evenChars.append(c);
                } else { // Append odd-indexed characters to oddChars StringBuilder
                    oddChars.append(c);
                }
            }
        }

        // Concatenate evenChars and oddChars StringBuilder objects and return the result
        return evenChars.toString() + oddChars.toString();
    }
}