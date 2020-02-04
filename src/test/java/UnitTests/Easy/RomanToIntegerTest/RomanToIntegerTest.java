package UnitTests.Easy.RomanToIntegerTest;

import Solutions.Easy.RomanToInteger.RomanToInteger;
import org.junit.jupiter.api.Test;
import util.Assert;

public class RomanToIntegerTest {
    private RomanToInteger rti = new RomanToInteger();

    @Test
    void testRomanToInteger() {
        Assert.assertEquals(0, rti.romanToInt(""));
        Assert.assertEquals(1, rti.romanToInt("I"));
        Assert.assertEquals(2, rti.romanToInt("II"));
        Assert.assertEquals(3, rti.romanToInt("III"));
        Assert.assertEquals(4, rti.romanToInt("IV"));
        Assert.assertEquals(5, rti.romanToInt("V"));
        Assert.assertEquals(6, rti.romanToInt("VI"));
        Assert.assertEquals(9, rti.romanToInt("IX"));
        Assert.assertEquals(58, rti.romanToInt("LVIII"));
        Assert.assertEquals(1994, rti.romanToInt("MCMXCIV"));
    }

    @Test
    void testRomanToIntegerSimple() {
        Assert.assertEquals(0, rti.romanToIntSimple(""));
        Assert.assertEquals(1, rti.romanToIntSimple("I"));
        Assert.assertEquals(2, rti.romanToIntSimple("II"));
        Assert.assertEquals(3, rti.romanToIntSimple("III"));
        Assert.assertEquals(4, rti.romanToIntSimple("IV"));
        Assert.assertEquals(5, rti.romanToIntSimple("V"));
        Assert.assertEquals(6, rti.romanToIntSimple("VI"));
        Assert.assertEquals(9, rti.romanToIntSimple("IX"));
        Assert.assertEquals(58, rti.romanToIntSimple("LVIII"));
        Assert.assertEquals(1994, rti.romanToIntSimple("MCMXCIV"));
    }
}
