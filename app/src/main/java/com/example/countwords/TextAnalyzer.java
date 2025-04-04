package com.example.countwords;

public class TextAnalyzer {
    public int countWords(String text) {
        if (text == null)
            return 0;
        //replace all punctuation with spaces
        text = text.replaceAll("[.,!?;:\"()\\[\\]{}]", "");
        //split text into words
        if (text.trim().isEmpty())
            return 0;
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public int countCharacters(String text) {
        if (text == null || text.isEmpty())
            return 0;
        return text.length();
    }

    private boolean isPunctuation(char c) {
        return ",.!?;:'\"()[]{}-".indexOf(c) != -1;
    }
}
