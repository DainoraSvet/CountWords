package com.example.countwords;

public class TextAnalyzer {
    public int countWords(String text) {
        if (text == null || text.isEmpty())
            return 0;
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public int countCharacters(String text) {
        int counter = 0;
        if (text == null || text.isEmpty())
            return 0;

        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                counter++;
            }
        }

        return counter;
    }

    private boolean isPunctuation(char c) {
        return ",.!?;:'\"()[]{}-".indexOf(c) != -1;
    }
}
