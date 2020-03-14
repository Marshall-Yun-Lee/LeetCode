package UnitTests.Easy;

import Solutions.Easy.LengthofLastWord.LengthofLastWord;
import org.junit.jupiter.api.Test;
import util.Assert;
import util.Logger;

public class LengthofLastWordTest {
    Logger log = Logger.getInstance();
    LengthofLastWord llw = new LengthofLastWord();

    @Test
    public void validatelengthOfLastWord() {
        Assert.assertEquals(5, llw.lengthOfLastWord("Hello World"));
        Assert.assertEquals(3, llw.lengthOfLastWord("meh"));
        Assert.assertEquals(5, llw.lengthOfLastWord("Hello World World"));
        Assert.assertEquals(1, llw.lengthOfLastWord("Hello World     A"));
        Assert.assertEquals(0, llw.lengthOfLastWord("A  "));
        Assert.assertEquals(0, llw.lengthOfLastWord(""));
    }
}

