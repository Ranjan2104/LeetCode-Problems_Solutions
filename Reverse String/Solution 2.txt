class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++) {
            char curr = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = curr;
        }
        System.out.println(Arrays.toString(s));
    }
}
// Contributed by Amresh Ranjan.