package Solutions.Easy.MaximumSubarray;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) { // unsorted
        int max = 0;
        int acc = 0;
        for (int each: nums) {
            acc = Math.max(acc + each, each);
            max = Math.max(max, acc);
        }
        return max;
    }
}

//     -2, 1, -3, 4, -1, 2, 1, -5, 4