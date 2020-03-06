package UnitTests.Easy;

import Solutions.Easy.RemoveElement.RemoveElement;
import org.junit.jupiter.api.Test;
import util.Assert;

public class RemoveElementTest {
    private RemoveElement rm = new RemoveElement();

    @Test
    public void validateRemove() {
        int[] input = {1, 2, 3, 4, 5};
        for (int i = 0; i < rm.removeElement(input, 5); i++) {
            Assert.assertEquals(input[i], i + 1);
        }

        int[] input2 = {1, 1, 1, 1, 1};
        Assert.assertEquals(rm.removeElement(input2, 1), 0);

        int[] input3 = {1 ,2, 1};
        for (int i = 0; i < rm.removeElement(input3, 1); i++) {
            Assert.assertEquals(input3[i], 2);
        }
    }
}