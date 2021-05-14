class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for(int i=1;i < nums.length; i++){
            int num = nums[i];
            if(num != major){
                count--;
            }
            else{
                count++;
            }
            
            if(count == 0){
                major = nums[i];
                count = 1;
            }
        }
        return major;
    }
}
// Contributed by Amresh Ranjan.