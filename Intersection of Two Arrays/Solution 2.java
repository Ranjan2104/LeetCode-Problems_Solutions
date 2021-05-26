class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) set.add(n);
        for (int n : nums2) {
            if (!set.contains(n)) continue;
            list.add(n);
            set.remove(n);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) ans[i] = list.get(i);
        return ans;
    }
}
// Contributed by Amresh Ranjan.