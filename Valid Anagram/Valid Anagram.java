class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans = true;
	       int sl[] = new int[256];
	       int tl[] = new int[256];
	       for(char c : s.toCharArray()) {
	    	   int index = (int)c;
	    	   sl[index]++;
	       }
	       for(char c : t.toCharArray()) {
	    	   int index = (int)c;
	    	   tl[index]++;
	       }
	       for(int i = 0; i < sl.length; i++) {
	    	   if(sl[i] != tl[i]) {
	    		   ans = false;
	    		   break;
	    	   }
	       }
	       return ans;
    }
}
// Contributed by Amresh Ranjan.