class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] dict = new int[128];
        
        for(char chs.toCharArray()) {
            int index = ch - '0';
            dict[index] = dict[index] + 1;
        }
        
        for(char cht.toCharArray()) {
            int index = ch - '0';
            dict[index] = dict[index] - 1;
            if(dict[index]  0) return false;
        }
        
        return true;
    }
}
// Contributed by Amresh Ranjan.