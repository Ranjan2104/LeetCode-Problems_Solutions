class Solution {
    public int majorityElement(int[] nums) {
        Integer cand = null;
        int count =0;
        for(int num : nums) {
            if(count == 0) cand = num;
            count += cand == num ? 1 : -1;
        }
        return cand;
    }
}
// Contributed by Amresh Ranjan.