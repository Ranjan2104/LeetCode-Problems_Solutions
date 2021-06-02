class Solution {
    public void moveZeroes(int[] nums) {
		int i = 0;
        int j = 0;
 
        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
        }
 
        j++;
    }
 
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }
}
// Contributed by Amresh Ranjan.