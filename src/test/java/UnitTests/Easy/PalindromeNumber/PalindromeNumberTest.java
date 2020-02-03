package UnitTests.Easy.PalindromeNumber;

import Solutions.Easy.PalindromeNumber.PalindromeNumber;
import org.junit.jupiter.api.Test;
import util.Logger;
import util.SoftAssert;

class PalindromeNumberTest {
    private Logger log = Logger.getInstance();
    private final PalindromeNumber palindrome = new PalindromeNumber();

    @Test
    void testPalindrome() {
        // True
        SoftAssert.assertTrue(palindrome.isPalindrome(121));
        SoftAssert.assertTrue(palindrome.isPalindrome(11));
        SoftAssert.assertTrue(palindrome.isPalindrome(1111));
        SoftAssert.assertTrue(palindrome.isPalindrome(11111));
        SoftAssert.assertTrue(palindrome.isPalindrome(12321));
        SoftAssert.assertTrue(palindrome.isPalindrome(123454321));
        SoftAssert.assertTrue(palindrome.isPalindrome(1597951));

        // False
        SoftAssert.assertFalse(palindrome.isPalindrome(1212));
        SoftAssert.assertFalse(palindrome.isPalindrome(14846));
        SoftAssert.assertFalse(palindrome.isPalindrome(14864));
    }

    @Test
    void testNegative() {
        SoftAssert.assertFalse(palindrome.isPalindrome(-121));
        SoftAssert.assertFalse(palindrome.isPalindrome(-3518));
    }

}
