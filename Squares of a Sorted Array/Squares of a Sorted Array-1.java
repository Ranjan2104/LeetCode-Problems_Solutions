class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr  = new int[nums.length];
        int cons = 0;
        for(int i = 0; i < nums.length; i++)
        {
            arr[cons] = nums[i] * nums[i];
            cons++;
        }
        Arrays.sort(arr);
        return arr;    
    }   
}
// Contributed by Amresh Ranjan.