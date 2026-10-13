import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> s = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            s.add(nums[i]);
        }

        int[] n = s.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(n);

        if(n.length == 0)
        {
            return 0;
        }

        int k = 1;
        int count = 1;

        for(int j = 0; j < n.length - 1; j++)
        {
            if(n[j] + 1 == n[j + 1])
            {
                count++;
            }
            else
            {
                count = 1;
            }

            if(count > k)
            {
                k = count;
            }
        }

        return k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna