class Solution {
public:
    vector<string> 
    buildArray(vector<int>& target, int n) 
    {
        vector<string> vecRes;
        int idx = 0;
        for (int i = 1; i <= n, idx < target.size(); i++) {
            vecRes.push_back("Push");
            if (target[idx] == i) {
                idx++;
            } else if (target[idx] > i) {
                vecRes.push_back("Pop");
            }
        } 
        return vecRes;
    }
};
// Contributed by Amresh Ranjan.