

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] sorted = new int[A.length];
        int evenIndex=0,oddIndex=A.length-1;
        for (int num:A){
            if (num%2==0){
                sorted[evenIndex++]=num;
            }else {
                sorted[oddIndex--]=num;
            }
        }
        return sorted;
    }
}
// Contributed by Amresh Ranjan.