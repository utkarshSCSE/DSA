class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = intervals.length;
        int previousEndTime = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            if (previousEndTime <= interval[0]) {
                count--;
                previousEndTime = interval[1];
            }
        }

        return count;
    }
}