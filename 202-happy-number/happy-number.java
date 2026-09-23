import java.util.*;

class Solution {

    public boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while(n != 1) {

            if(seen.contains(n)) {
                return false;
            }

            seen.add(n);

            String s = Integer.toString(n);

            int sum = 0;

            for(int i = 0; i < s.length(); i++) {

                int digit = s.charAt(i) - '0';

                sum = sum + digit * digit;
            }

            n = sum;
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna