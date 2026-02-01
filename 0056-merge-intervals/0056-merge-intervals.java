class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Use a list to store merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Iterate through intervals
        for (int[] interval : intervals) {
            // If merged is empty or no overlap
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Overlap exists, merge intervals
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Step 4: Convert list to array
        return merged.toArray(new int[merged.size()][]);
        
    }
}