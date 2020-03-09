package UnitTests.Easy;

import Solutions.Easy.ImplementstrStr.ImplementstrStr;
import org.junit.jupiter.api.Test;
import util.Assert;

public class ImplementstrStrTest {

    private ImplementstrStr str = new ImplementstrStr();

    @Test
    public void validateStr() {
        Assert.assertEquals(str.strStr("hello", "ll"), 2, "hello + ll");
        Assert.assertEquals(str.strStr("meh", "1"), -1, "meh + 1");
        Assert.assertEquals(str.strStr("hello", "o"), 4, "hello + o");
        Assert.assertEquals(str.strStr("hello", "h"), 0, "hello + h");
        Assert.assertEquals(str.strStr("hello", "hello"), 0, "hello + hello");
        Assert.assertEquals(str.strStr("123123", "2"), 1, "123123 + 2");
        Assert.assertEquals(str.strStr("aaaaa", "a"), 0, "aaaaa + a");
        Assert.assertEquals(str.strStr("aaaaa", "aaaaaaa"), -1, "aaaaa + aaaaaaa");
    }
}

