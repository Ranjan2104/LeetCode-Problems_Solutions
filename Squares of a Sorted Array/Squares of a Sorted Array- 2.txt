class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int start = 0;
        int end = n-1;
        int e = n-1;
        while(start <= end) {
            if(nums[start] * nums[start] > nums[end] * nums[end]) {
                result[e--] = nums[start] * nums[start];
                start++;
            } else {
                result[e--] = nums[end] * nums[end];
                end--;
            }
        }
        return result;
    }   
}
// Contributed by Amresh Ranjan.