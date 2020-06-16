package UnitTests.Easy;

import Solutions.Easy.CountandSay.CountandSay;
import org.junit.jupiter.api.Test;
import util.*;

public class CountandSayTest {
    Logger log = Logger.getInstance();
    CountandSay cs = new CountandSay();


    @Test
    public void validatesCountAndSay() {
        Assert.assertEquals("1", cs.countAndSay(1));
        Assert.assertEquals("11", cs.countAndSay(2));
        Assert.assertEquals("21", cs.countAndSay(3));
        Assert.assertEquals("1211", cs.countAndSay(4));
        Assert.assertEquals("111221", cs.countAndSay(5));
        Assert.assertEquals("312211", cs.countAndSay(6));
        Assert.assertEquals("13112221", cs.countAndSay(7));
        Assert.assertEquals("1113213211", cs.countAndSay(8));
        Assert.assertEquals("31131211131221", cs.countAndSay(9));
        Assert.assertEquals("13211311123113112211", cs.countAndSay(10));
    }
}


