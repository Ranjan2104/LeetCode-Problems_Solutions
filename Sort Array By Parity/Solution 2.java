

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] a = new int[A.length];
        int c = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                a[c++] = A[i];
            }
        }
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 1) {
                a[c++] = A[i];
            }
        }
        return a;
    }
}
// Contributed by Amresh Ranjan.