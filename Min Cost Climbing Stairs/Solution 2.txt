class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int s0 = cost[0];
        int s1 = cost[1];
        
        for(int i=2; i<cost.length; i++){
            int tmp = Math.min(s1,s0)+cost[i];
            s0=s1;
            s1=tmp;
        }
        
        return Math.min(s0,s1);
    }
}
// Contributed by Amresh Ranjan.