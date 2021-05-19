class Solution {
    public String reverseWords(String s) {
        int i = s.length() - 1;
        String str = "";
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) == ' ')
                i--;
            int j = i;
            if(i < 0) break;
            while(i >= 0 && s.charAt(i) != ' ')
                i--;
            if(str.isEmpty())
                str = str.concat(s.substring(i+1, j+1));
            else
                str = str.concat(" " + s.substring(i+1, j+1));       
        }
        return str;
    }
}
// Contributed by Amresh Ranjan.