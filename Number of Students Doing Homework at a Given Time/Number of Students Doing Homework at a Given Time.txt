class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        int j = 0;
        for(int i = 0; i < startTime.length; i++) {
            if(startTime[i] <= queryTime && queryTime <=endTime[j]) {
                count++;
            }
            j++;
        }
        return count;
    }
}
// Contributed by Amresh Ranjan.