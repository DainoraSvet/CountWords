package com.example.countwords;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    //Words test
    @Test
    public void given_empty_string_when_CountWords_return_zero(){
        TextAnalyzer analyzer = new TextAnalyzer();
        String given = "";
        int expectedResult = 0;
        int actualResult = analyzer.countWords(given);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given_twoWords_string_when_CountWords_return_two() {
        TextAnalyzer analyzer = new TextAnalyzer();

        String given = "Labas pasauli";
        int expectedResult = 2;
        int actualResult = analyzer.countWords(given);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given_normalText_string_when_CountWords_return_correctWordCount() {
        TextAnalyzer analyzer = new TextAnalyzer();

        String given = "Labas pasauli, ar viskas gerai?";
        int expectedResult = 5;
        int actualResult = analyzer.countWords(given);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given_onlySpaces_string_when_CountWords_return_zero() {
        TextAnalyzer analyzer = new TextAnalyzer();

        String given = " ";
        int expectedResult = 0;
        int actualResult = analyzer.countWords(given);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given_onlySymbols_string_when_CountWords_return_zero() {
        TextAnalyzer analyzer = new TextAnalyzer();

        String given = "?.:;()";
        int expectedResult = 0;
        int actualResult = analyzer.countWords(given);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given_sentenceWithExtraSpaces_string_when_CountWords_return_zero() {
        TextAnalyzer analyzer = new TextAnalyzer();

        String given = "Labas    pasauli   ";
        int expectedResult = 2;
        int actualResult = analyzer.countWords(given);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given_null_string_when_CountWords_return_zero() {
        TextAnalyzer analyzer = new TextAnalyzer();

        String given = null;
        int expectedResult = 0;
        int actualResult = analyzer.countWords(given);
        assertEquals(expectedResult, actualResult);
    }

    //Characters test
    @Test
    public void given_empty_string_when_CountCharacters_return_zero() {
        TextAnalyzer analyzer = new TextAnalyzer();

        String given = "";
        int expectedResult = 0;
        int actualResult = analyzer.countCharacters(given);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given_fiveCharacters_string_when_CountCharacters_return_five() {
        TextAnalyzer analyzer = new TextAnalyzer();

        String given = "Labas";
        int expectedResult = 5;
        int actualResult = analyzer.countCharacters(given);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given_onlySpaces_string_when_CountCharacters_return_one() {
        TextAnalyzer analyzer = new TextAnalyzer();

        String given = " ";
        int expectedResult = 1;
        int actualResult = analyzer.countCharacters(given);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given_null_string_when_CountCharacters_return_zero() {
        TextAnalyzer analyzer = new TextAnalyzer();

        String given = null;
        int expectedResult = 0;
        int actualResult = analyzer.countCharacters(given);
        assertEquals(expectedResult, actualResult);
    }

}