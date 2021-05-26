class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sc = new HashSet<>();
        for(int num : nums) {
            if(!sc.add(num))
                return true;
        }
        return false;
    }
}
// Contributed by Amresh Ranjan.