package UnitTests.Easy;

import Solutions.Easy.ValidParentheses.ValidParentheses;
import org.junit.jupiter.api.Test;
import util.Assert;

public class ValidParenthesesTest {

    private ValidParentheses vp = new ValidParentheses();

    @Test
    public void trueValidParentheses() {
        Assert.assertTrue(vp.isValid("{}{}"));
        Assert.assertTrue(vp.isValid("{([])}"));
        Assert.assertTrue(vp.isValid("{}()[]"));
        Assert.assertTrue(vp.isValid("{}"));
        Assert.assertTrue(vp.isValid("()"));
        Assert.assertTrue(vp.isValid("[]"));
    }

    @Test
    public void falseValidParentheses() {
        Assert.assertFalse(vp.isValid("[]{{{"));
        Assert.assertFalse(vp.isValid("{)"));
        Assert.assertFalse(vp.isValid("{}})"));
        Assert.assertFalse(vp.isValid("()(}){)"));
        Assert.assertFalse(vp.isValid("{}}{"));
        Assert.assertFalse(vp.isValid("{([{]})}"));
    }
}
