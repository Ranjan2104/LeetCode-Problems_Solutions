class Solution {
    public int maxSubArray(int[] nums) {
        int[] arr= new int[nums.length] ;
        arr[0] = nums[0];
        int max = arr[0] ;
        for(int i=1 ; i< nums.length ; i++){
            arr[i] = Math.max(arr[i-1]+nums[i],nums[i]); 
            max= Math.max(max, arr[i]); 
        }
        return max;
    }
}
// Contributed by Amresh Ranjan.
