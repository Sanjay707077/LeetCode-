import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int a = 0; a < nums.length - 3; a++) {

            if(a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }

            for(int b = a + 1; b < nums.length - 2; b++) {

                if(b > a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }

                for(int c = b + 1; c < nums.length - 1; c++) {

                    if(c > b + 1 && nums[c] == nums[c - 1]) {
                        continue;
                    }

                    for(int d = c + 1; d < nums.length; d++) {

                        if(d > c + 1 && nums[d] == nums[d - 1]) {
                            continue;
                        }

                        long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];

                        if(sum == target) {

                            List<Integer> temp = new ArrayList<>();

                            temp.add(nums[a]);
                            temp.add(nums[b]);
                            temp.add(nums[c]);
                            temp.add(nums[d]);

                            result.add(temp);
                        }
                    }
                }
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna