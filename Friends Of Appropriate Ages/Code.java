class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for(int age : ages) 
            count[age]++;
        int ans = 0;
        for(int age_A = 0; age_A <= 120; age_A++) {
            int countA = count[age_A];
            for(int age_B = 0; age_B <= 120; age_B++) {
                int countB = count[age_B];
                if(age_A *0.5 + 7 >= age_B)
                    continue;
                if(age_B > age_A)
                    continue;
                if(age_B > 100 && age_A < 100)
                    continue;
                ans += countA * countB;
                if(age_A == age_B) 
                    ans -= countA;
            }
        }
        return ans;
    }
} // Contributed by Amresh Ranjan.