import java.util.PriorityQueue;

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] != a[0] ? b[0] - a[0] : b[1] - a[1]);
        
        for (int i = 0; i < n; i++) {
            maxHeap.offer(new int[]{nums[i], i});
            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }
            if (i >= k - 1) {
                result[ri++] = maxHeap.peek()[0];
            }
        }
        
        return result;
    }
}
