package UnitTests.Easy.LongestCommonPrefixTest;

import Solutions.Easy.LongestCommonPrefix.LongestCommonPrefix;
import org.junit.jupiter.api.Test;
import util.Assert;

public class LongestCommonPrefixTest {
    private LongestCommonPrefix lcp = new LongestCommonPrefix();

    @Test
    void tesLongestCommonPrefix() {
        String[] emptyList = {""};
        String[] ugh = {"aa", "a"};
        String[] what = {"", "", ""};
        String[] the = {"", "e", ""};
        String[] mmm = {"", "e", "", "eb"};
        String[] mmmm = {"a", "", "", "eb"};
        String[] same = {"q", "q"};
        String[] flList = {"flower", "flow", "flight"};
        String[] noList = {"asdf", "qwer", "zxcv"};
        String[] lastList = {"sdfajklII", "sfdjaklII", "ejfwII"};
        String[] extremeList1 = {"aaaaaaa", "aaaeewerewrqwereqrwerwqeqwr", "azzxcvzxcvzxcv"};
        String[] extremeList2 = {"aaaaaaafjdsklafehwfqhfuoqufheqwfjkasdfasdkjlbvcxznwgeqfiuyqyufgdsg", "aaaeewerewrqwereqrwerwqeqwr", "azzxcvzxcvzxcv"};

        Assert.assertEquals("a", lcp.longestCommonPrefix(ugh));
        Assert.assertEquals("q", lcp.longestCommonPrefix(same));
        Assert.assertEquals("", lcp.longestCommonPrefix(emptyList));
        Assert.assertEquals("", lcp.longestCommonPrefix(what));
        Assert.assertEquals("", lcp.longestCommonPrefix(the));
        Assert.assertEquals("", lcp.longestCommonPrefix(mmm));
        Assert.assertEquals("", lcp.longestCommonPrefix(mmmm));
        Assert.assertEquals("fl", lcp.longestCommonPrefix(flList));
        Assert.assertEquals("", lcp.longestCommonPrefix(noList));
        Assert.assertEquals("", lcp.longestCommonPrefix(lastList));
        Assert.assertEquals("a", lcp.longestCommonPrefix(extremeList1));
        Assert.assertEquals("a", lcp.longestCommonPrefix(extremeList2));
    }
}
