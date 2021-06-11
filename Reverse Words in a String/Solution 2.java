class Solution {
    public String reverseWords(String s) {
         StringBuilder result = new StringBuilder();
         String[] array = s.split(" ");
         for(int i = array.length-1; i>= 0; i--) {
             if (!array[i].isEmpty())
                result.append(array[i]).append(" ");
         }
        return result.toString().trim();
    }
}
// Contributed by Amresh Ranjan.