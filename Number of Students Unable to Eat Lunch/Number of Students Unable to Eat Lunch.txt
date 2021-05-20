class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count[] = new int[2];
        for(int i = 0; i < students.length; i++) {
            count[students[i]]++;
        }
        for(int i = 0; i < students.length; i++){
            if(--count[sandwiches[i]] < 0)
                break;
        }
        return Math.max(count[0], count[1]);
    }
}
// Contributed by Amresh Ranjan.