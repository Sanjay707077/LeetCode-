class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1;
        for (int i = 1, t = 1; i < nums.length; ++i) {
            if (nums[i - 1] < nums[i]) {
                ans = Math.max(ans, ++t);
            } else {
                t = 1;
            }
        }
        for (int i = 1, t = 1; i < nums.length; ++i) {
            if (nums[i - 1] > nums[i]) {
                ans = Math.max(ans, ++t);
            } else {
                t = 1;
            }
        }
        
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna