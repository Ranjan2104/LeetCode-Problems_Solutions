class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // stuck condition is all left students are 0s, but top of sanwiches is 1, or vice versa
        
        int[] demand = new int[2];
        for(int student: students) demand[student]++;
        
        for(int i = 0; i < sandwiches.length; i++){
            demand[sandwiches[i]]--;
            if(demand[0] < 0 || demand[1] < 0)
                return sandwiches.length - i;
        }
        return 0;
    }
}
// Contributed by Amresh Ranjan.
