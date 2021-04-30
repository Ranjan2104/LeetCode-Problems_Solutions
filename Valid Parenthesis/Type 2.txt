class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(', ')'); // (key, value) pair
        map.put('[', ']');
        map.put('{', '}');
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.keySet().contains(ch))
                stack.push(ch);
            else if(map.values().contains(ch)) {
                if(!stack.empty() && map.get(stack.peek()) == ch) {
                    stack.pop();
                }else 
                    return false;
            }
        }
        return stack.empty();
    }
}
// Contributed by Amresh Ranjan.