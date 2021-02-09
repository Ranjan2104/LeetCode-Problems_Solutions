class Interval {
    int start;
    int end;
    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1)
            return intervals;
        LinkedList<Interval> ll = new LinkedList<>();
        for(int[] temp : intervals) {
            ll.add(new Interval(temp[0], temp[1]));
        }
        Collections.sort(ll, new Comparator<Interval>(){
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        LinkedList<Interval> result = new LinkedList<>();
        for(Interval curr : ll) {
            if(result.isEmpty() || result.getLast().end < curr.start) {
                result.add(curr);
            } else {
                result.getLast().end = Math.max(curr.end, result.getLast().end);
            }
        }
        int[][] res = new int[result.size()][2];
        int count = 0;
        for(Interval temp : result) {
            res[count][0] = temp.start;
            res[count][1] = temp.end;
            count++;
        }
        return res;
    }
} // Contributed by Amresh Ranjan.