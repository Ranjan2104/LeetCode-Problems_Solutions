class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() <= 1) {
            return false;
        } 
        
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (map.containsKey(c)) {
                if (stack.empty() || stack.pop() != map.get(c)){
                    return false;
                }
            }
        }
        
        return stack.empty() ? true : false;
    }
}
// Contributed by Amresh Ranjan.