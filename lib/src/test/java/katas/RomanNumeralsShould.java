package katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralsShould {
    private RomanNumerals romanNumerals = new RomanNumerals();

    @ParameterizedTest
    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
        "4, IV",
        "5, V",
        "7, VII",
        "9, IX",
        "10, X",
        "37, XXXVII",
        "40, XL",
        "50, L",
        "88, LXXXVIII",
        "90, XC",
        "100, C",
        "300, CCC",
        "400, CD",
        "500, D",
        "900, CM",
        "1000, M",
        "1492, MCDXCII",
        "1985, MCMLXXXV",
        "3627, MMMDCXXVII"
    })
    public void convertArabicToRoman(int arabic, String expected) {
        assertEquals(expected, romanNumerals.convert(arabic));
    }
}
