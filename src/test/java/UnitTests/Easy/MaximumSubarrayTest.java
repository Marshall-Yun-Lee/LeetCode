package UnitTests.Easy;

import Solutions.Easy.MaximumSubarray.MaximumSubarray;
import org.junit.jupiter.api.Test;
import util.Assert;

public class MaximumSubarrayTest {
    MaximumSubarray max = new MaximumSubarray();

    @Test
    public void validateMaximumSubarray() {
        int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        Assert.assertEquals(6, max.maxSubArray(input));
    }
}

