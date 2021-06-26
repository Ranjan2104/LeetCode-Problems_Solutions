class Solution {
    public int leastInterval(char[] tasks, int n) {
        int f[] = new int[26];
        for(char task : tasks)
            f[task - 'A']++;
        Arrays.sort(f);
        int item = f[25] -1;
        int spots = item * n;
        
        for(int i = 24; i >= 0; i--){
            spots -= Math.min(item, f[i]);
        }
        return spots < 0 ? tasks.length : spots + tasks.length;
    }
}
// Contributed by Amresh Ranjan.