package com.github.hotire.springtest.pi;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }

    @Test
    public void isPalindromeEmpty() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }
}