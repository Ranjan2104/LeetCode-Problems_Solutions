class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0)
            return nums;
        
        Deque<Integer> deque = new LinkedList<Integer>();
        
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[deque.peekFirst()] <= nums[i]) {
                deque.removeFirst();
            }
            deque.addFirst(i);
        }
        
        int[] result = new int[nums.length-k+1];
        
        for (int i = k; i < nums.length; i++) {
            result[i-k] = nums[deque.peekLast()];
            
            while(!deque.isEmpty() && deque.peekLast() <= i-k) {
                deque.removeLast();
            }
            
            while (!deque.isEmpty() && nums[deque.peekFirst()] < nums[i]) {
                deque.removeFirst();
            }
            deque.addFirst(i);
        }
        result[nums.length-k] = nums[deque.peekLast()];
        
        return result;
    }
}
// Contributed by Amresh Ranjan.