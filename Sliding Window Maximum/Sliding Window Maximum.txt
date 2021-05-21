class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        
        if(n <= 1) return nums;
        
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(n-1);
        nge[n-1] = n;
        int res[] = new int[n-k+1];
        
        for(int i = n-2; i >= 0; i--) {
            while(stack.size() > 0 && nums[i] >= nums[stack.peek()]){
                stack.pop();
            }
            if(stack.size() == 0) nge[i] = n;
            else nge[i] = stack.peek();
            stack.push(i);
        }
        int j = 0;
        for(int i = 0; i <= n - k; i++){
            if(i > j) j = i;
            while(nge[j] < i + k)
                j = nge[j];
            res[i] = nums[j];
            }
        return res;
        }
    }
// Contributed by Amresh Ranjan.