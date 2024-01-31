package org.howard.edu.lsp.assignment2;

/**
*  Name: Asis Johnson
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class WordCounter {

    public static void main(String[] args) {
        // Relative path to the file from the project root
        String relativePath = "src/org/howard/edu/lsp/assignment2/words.txt";
        Map<String, Integer> wordCount = countWords(relativePath);

        if (!wordCount.isEmpty()) {
            displayWordCount(wordCount);
        } else {
            System.out.println("File not found or empty.");
        }
    }

    public static Map<String, Integer> countWords(String relativePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try {
            File file = new File(relativePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase().replaceAll("[^a-zA-Z]", "");

                if (word.length() > 3) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return wordCount;
    }

    public static void displayWordCount(Map<String, Integer> wordCount) {
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}