class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!n.add(nums[i])) {
                return nums[i];
            }
        }
        return 0;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna