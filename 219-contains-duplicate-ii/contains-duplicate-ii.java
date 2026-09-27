import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map stores: Key = the number, Value = its most recent index (pos)
        HashMap<Integer, Integer> map = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            // Instantly look up the previous position without scanning
            if (map.containsKey(nums[i])) {
                int pos = map.get(nums[i]);
                
                if ((i - pos) <= k) {
                    return true;
                }
            }
            
            // Put (or update) the number with its current index
            map.put(nums[i], i);
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna