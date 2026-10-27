class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0; 
        int r = 0; 
        int s = 0; 
        
        int currentSum = 0;
        int targetSum = k * threshold; 

        for (r = 0; r < arr.length; r++) {
            currentSum += arr[r]; 
            if (r - l + 1 == k) {
                if (currentSum >= targetSum) {
                    s++;
                }
                currentSum -= arr[l];
                l++;
            }
        }
        return s;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna