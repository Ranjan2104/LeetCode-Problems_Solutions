class Solution {
    public int searchInsert(int[] nums, int target) {
        int id = 0;
        while(id < nums.length){
            if(nums[id] == target || nums[id] > target) {
                return id;
            }
            id++;
        }
        return id;
    }
}
// Contributed by Amresh Ranjan.