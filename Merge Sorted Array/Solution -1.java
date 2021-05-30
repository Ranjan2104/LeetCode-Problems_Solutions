class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j=0 ; i< m+n && j<n; i++,j++){
            nums1[i] = nums2[j];
        }
        
        Arrays.sort(nums1);
    }
}
// Contributed by Amresh Ranjan.