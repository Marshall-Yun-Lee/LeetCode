package UnitTests.Easy;

import Solutions.Easy.PalindromeNumber.PalindromeNumber;
import org.junit.jupiter.api.Test;
import util.Logger;
import util.Assert;

class PalindromeNumberTest {
    private Logger log = Logger.getInstance();
    private final PalindromeNumber palindrome = new PalindromeNumber();

    @Test
    void testPalindrome() {
        // True
        Assert.assertTrue(palindrome.isPalindrome(121));
        Assert.assertTrue(palindrome.isPalindrome(11));
        Assert.assertTrue(palindrome.isPalindrome(1111));
        Assert.assertTrue(palindrome.isPalindrome(11111));
        Assert.assertTrue(palindrome.isPalindrome(123321));
        Assert.assertTrue(palindrome.isPalindrome(12121));
        Assert.assertTrue(palindrome.isPalindrome(12321));
        Assert.assertTrue(palindrome.isPalindrome(123454321));
        Assert.assertTrue(palindrome.isPalindrome(1597951));

        // False
        Assert.assertFalse(palindrome.isPalindrome(1212));
        Assert.assertFalse(palindrome.isPalindrome(14846));
        Assert.assertFalse(palindrome.isPalindrome(14864));
    }

    @Test
    void testNegative() {
        Assert.assertFalse(palindrome.isPalindrome(-121));
        Assert.assertFalse(palindrome.isPalindrome(-3518));
    }

}
