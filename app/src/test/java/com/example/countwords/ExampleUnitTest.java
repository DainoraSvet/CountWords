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

    @Test
    public void given_empty_string_when_CountWords_return_zero(){
        TextAnalyzer analyzer = new TextAnalyzer();
        String given = "";
        int expectedResult = 0;
        int actualResult = analyzer.countWords(given);
        assertEquals(expectedResult, actualResult);
    }
}