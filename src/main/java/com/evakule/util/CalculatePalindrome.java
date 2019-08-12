package com.evakule.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CalculatePalindrome {

    public static Long getFirstPalindrome(long start, long countOfPalindromes) {
        return CalculatePalindrome.getPalindromes(start, countOfPalindromes).get(0);
    }

    public static Long getLastPalindrome(long start, long countOfPalindromes) {
        return CalculatePalindrome.getPalindromes(start, countOfPalindromes).get((int) countOfPalindromes - 1);
    }

    private static List<Long> getPalindromes(long start, long countOfPalindromes) {
        return Stream.iterate(start, n -> n + 1)
                .filter(CalculatePalindrome::isPalindrome)
                .limit(countOfPalindromes)
                .collect(Collectors.toList());
    }

    private static boolean isPalindrome(long integer) {
        return integer == LongStream
                .iterate(
                        integer,
                        palindrome -> palindrome != 0,
                        palindrome -> palindrome / 10)
                .map(u -> u % 10) // determine the remainder
                .reduce(0, (
                        reverse,
                        remainder) -> reverse * 10 + remainder);
    }
}