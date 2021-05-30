class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        Stack<int[]> stack = new Stack<>();
        stack.add(intervals[0]);
        
        for(int i = 1; i < intervals.length; i++){
            int startpoint2 = intervals[i][0];
            int endpoint2 = intervals[i][1];
            
            int[] poparray = stack.pop();
            
            int startpoint1 = poparray[0];
            int endpoint1 = poparray[1];
            
            int endmax = Math.max(endpoint1, endpoint2);
            if(endpoint1 >= startpoint2) {
                int[] merge = new int[]{startpoint1, endmax};
                stack.add(merge);
            }
            else{
                stack.add(poparray);
                stack.add(intervals[i]);
            }
        }
        int[][] output = new int[stack.size()][2];
        for(int j = stack.size()-1; j >= 0; j--) {
            int[] poparray = stack.pop();
            output[j][0] = poparray[0];
            output[j][1] = poparray[1];
        }
        return output;
    }
}
// Contributed by Amresh Ranjan.