class Solution {
    public boolean isHappy(int n) {

        while(n != 1 && n != 4) {

            String s = Integer.toString(n);

            int sum = 0;

            for(int i = 0; i < s.length(); i++) {

                int digit = s.charAt(i) - '0';

                sum = sum + digit * digit;
            }

            n = sum;
        }

        if(n == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna