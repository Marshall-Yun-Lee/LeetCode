package UnitTests.Easy.ReverseIntegerTest;

import Solutions.Easy.ReverseInteger.ReverseInteger;
import org.junit.jupiter.api.Test;

import util.Assert;


class ReverseIntegerTest { // no need to specify privacy -- merely testing
    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    void testReverse() {
        Assert.assertEquals(123, reverseInteger.reverse(321), "reversing 321 -> expecting 123");
        Assert.assertEquals(321, reverseInteger.reverse(123), "reversing 123 -> expecting 321");
        Assert.assertEquals(1, reverseInteger.reverse(100), "reversing 100 -> expecting 1");
    }

    @Test
    void testNegative() {
        Assert.assertEquals(-123, reverseInteger.reverse(-321), "reversing -321 -> expecting -123");
        Assert.assertEquals(-7, reverseInteger.reverse(-7), "reversing -7 -> expecting -7");
        Assert.assertEquals(-1, reverseInteger.reverse(-100), "reversing -100 -> expecting -1");
    }

    @Test
    void testSingle() {
        Assert.assertEquals(3, reverseInteger.reverse(3), "reversing 3 -> expecting 3");
        Assert.assertEquals(0, reverseInteger.reverse(0), "reversing 0 -> expecting 0");
    }

    @Test
    void testInt() {
        Assert.assertEquals(0, reverseInteger.reverse(Integer.MAX_VALUE), "reversing MX -> expecting 0");
        Assert.assertEquals(0, reverseInteger.reverse(Integer.MIN_VALUE), "reversing MN -> expecting 0");
        Assert.assertEquals(0, reverseInteger.reverse(1147483647), "reversing *7 -> expecting 0");
        Assert.assertEquals(0, reverseInteger.reverse(1147483643), "reversing 346... -> expecting 0");
        Assert.assertEquals(0, reverseInteger.reverse(1147483612), "reversing 216... -> expecting 0");
        Assert.assertEquals(0, reverseInteger.reverse(-1147483648), "reversing -*8 -> expecting 0");
    }
}
