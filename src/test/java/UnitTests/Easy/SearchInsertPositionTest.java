package UnitTests.Easy;

import Solutions.Easy.SearchInsertPosition.SearchInsertPosition;
import org.junit.jupiter.api.Test;
import util.Assert;
import util.Logger;

public class SearchInsertPositionTest {
    private Logger log = Logger.getInstance();
    private SearchInsertPosition search = new SearchInsertPosition();

    @Test
    public void validateSearchInsert() {
        int[] input = {1, 2, 3, 4, 5};
        Assert.assertEquals(5, search.searchInsert(input, 6), "target: 6");
        Assert.assertEquals(0, search.searchInsert(input, 0), "target: 0");
        Assert.assertEquals(1, search.searchInsert(input, 2), "target: 2");

        int[] input2 = {1, 1, 1, 1, 1};
        Assert.assertEquals(0, search.searchInsert(input2, 1), "target: 1");

        int[] input3 = {1};
        Assert.assertEquals(0, search.searchInsert(input3, 0), "target: 0");
        Assert.assertEquals(1, search.searchInsert(input3, 2), "target: 2");
    }

}

