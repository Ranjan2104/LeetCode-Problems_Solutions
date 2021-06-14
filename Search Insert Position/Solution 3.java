class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1, mid = 0;
        while(start <= end) {
            mid = (start + end) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid-1;
            else 
                start = mid+1;
        }
        return Math.max(start, end);
    }
}
// Contributed by Amresh Ranjan.