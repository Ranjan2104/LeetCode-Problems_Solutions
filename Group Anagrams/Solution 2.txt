class Solution {
    public ListListString groupAnagrams(String[] strs) {
        ListListString result = new ArrayList();
        if(strs == null  strs.length == 0){
            return result;
        }
        
        MapString, ListString map = new HashMap();
        for(String s strs){
            char[] ss = s.toCharArray();
            Arrays.sort(ss);
            String sss = new String(ss);
            if(!map.containsKey(sss)){
                map.put(sss, new ArrayList());
            }
            map.get(sss).add(s);
        }
        
        for(String key map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }
}
// Contributed by Amresh Ranjan.