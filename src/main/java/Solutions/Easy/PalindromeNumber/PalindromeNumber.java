package Solutions.Easy.PalindromeNumber;

import util.Logger;

public class PalindromeNumber {
    private Logger log = Logger.getInstance();

    public boolean isPalindrome(int input) {
        // no negative
        // palindrome # never ends with 0
        // I guess 0-9 are automatic palindrome???
        if (input < 0 || input % 10 == 0) {
            return false;
        } else if (input < 10) {
            return true;
        }
        // A B C B A        // A B C C B A
        // Stack1: A B      // Stack1: A B C
        // Stack2: A B      // Stack2: A B C
        // Leftover: C      // Leftover: N/A
//        Stack stack1 = new Stack();
//        Stack stack2 = new Stack();
        // guess i'm thinking too much

        // simpler
        int half = 0;
        while (input > half) {
            half *= 10;             // add 0 to right if half != 0
            half += input % 10;     // add the last digit from input to half
            input /= 10;            // remove the last digit
        }
        if (input == half) {        // input has even # of digits + left and right are identical
            return true;
        } else {                    // at this point, input < half
            half /= 10;             // remove the last digit from half
            // now equal?
            return input == half;
        }
    }
}
