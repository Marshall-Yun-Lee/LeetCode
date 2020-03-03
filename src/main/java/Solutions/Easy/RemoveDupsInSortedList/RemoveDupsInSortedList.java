package Solutions.Easy.RemoveDupsInSortedList;

import util.Logger;

public class RemoveDupsInSortedList {
    private Logger log = Logger.getInstance();

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) return 0;
        int counter = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[counter] < nums[i]){
                nums[++counter] = nums[i];
            }
            print(nums);
        }
        return ++counter;
    }

    private void print(int[] arr) {
        System.out.println("---------------");
        for (int each: arr) {
            System.out.println(each);
        }
    }
}
