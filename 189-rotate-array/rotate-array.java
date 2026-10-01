class Solution {
    public void rotate(int[] nums, int k) {
       int[] set = new int[nums.length];

        k = k % nums.length;

        for (int i = 0; i < nums.length; i++) {

            int s = i + k;

            if (s >= nums.length) {
                s = s - nums.length;
            }

            set[s] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = set[i];
        }
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna