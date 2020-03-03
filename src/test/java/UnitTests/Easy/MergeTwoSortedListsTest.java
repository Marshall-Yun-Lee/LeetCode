package UnitTests.Easy;

import Solutions.Easy.MergeTwoSortedLists.MergeTwoSortedLists;
import org.junit.jupiter.api.Test;
import util.Assert;
import util.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MergeTwoSortedListsTest {
    private MergeTwoSortedLists mergeLists = new MergeTwoSortedLists();
    private Logger log = Logger.getInstance();

    private List<Integer> prep1 = Arrays.asList(1, 2, 4);
    private List<Integer> prep2 = Arrays.asList(1, 3, 4);
    private List<Integer> ans = Arrays.asList(1, 1, 2, 3, 4, 4);


    @Test
    void validateMergeTwoSortedLists() {
        LinkedList<Integer> input1 = new LinkedList<Integer>(prep1);
        LinkedList<Integer> input2 = new LinkedList<Integer>(prep2);
        validate(mergeLists.mergeUnsorted(input1, input2), new LinkedList<Integer>(ans));
    }

    /**
     * Validate linked list type.
     * @param actual: actual linked list to be validated
     * @param expected: expected linked list to be compared
     */
    private void validate(LinkedList<Integer> actual, LinkedList<Integer> expected) {
        // null check
        Assert.assertFalse(actual == null);
        Assert.assertFalse(expected == null);

        // size?
        Assert.assertTrue(actual.size() == expected.size());

        ListIterator<Integer> itrActual = actual.listIterator();
        ListIterator<Integer> itrExpected = expected.listIterator();
        try {
            while (itrActual.hasNext()) {
                int act = itrActual.next();
                int exp = itrExpected.next();

                log.debug("actual: " + act);
                log.debug("expected: " + exp);
                Assert.assertTrue(act == exp);
            }
        } catch (NullPointerException e) {
            log.fail("reached to null:::\n" + e.getLocalizedMessage() + "\n EoL");
        }
    }
}
