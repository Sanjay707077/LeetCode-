class Solution {
    public int addDigits(int num) {

        String n = Integer.toString(num);

        int sum = 0;

        for(int i = 0; i < n.length(); i++) {
            sum = sum + (n.charAt(i) - '0');
        }

        while(sum >= 10) {

            String s = Integer.toString(sum);

            int sum1 = 0;

            for(int j = 0; j < s.length(); j++) {
                sum1 = sum1 + (s.charAt(j) - '0');
            }

            sum = sum1;
        }

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna