package UnitTests.Easy;

import Solutions.Easy.RemoveDupsInSortedList.RemoveDupsInSortedList;
import org.junit.jupiter.api.Test;
import util.Assert;
import util.Logger;

public class RemoveDupsInSortedListTest {
    private RemoveDupsInSortedList removeDup = new RemoveDupsInSortedList();
    private Logger log = Logger.getInstance();

    private int[] noDups = {1, 2, 3, 4, 5};
    private int[] expect3 = {1, 1, 1, 2, 2, 3, 3, 3};
    private int[] expect1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};

    @Test
    public void validateRemoveDuplicates() {
        Assert.assertEquals(removeDup.removeDuplicates(noDups), 5, "no duplicates expecting 5");
        Assert.assertEquals(removeDup.removeDuplicates(expect3), 3, "3 is expected");
        Assert.assertEquals(removeDup.removeDuplicates(expect1), 1, "All same elements: expected 1");
    }
}
