package Solutions.Easy.SearchInsertPosition;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int counter = 0;
        while (counter < nums.length - 1) {
            if (nums[counter] >= target) {
                break;
            }
            counter++;
        }
        if(target > nums[nums.length - 1]) { // target is the largest in the array
            return nums.length; // counting from 0 -> the length should be the [last + 1]th
        }
        return counter;
    }
}