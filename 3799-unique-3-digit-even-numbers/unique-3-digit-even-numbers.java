class Solution {
    public int totalNumbers(int[] digits) {

        int count = 0;

        for (int i = 100; i <= 998; i++) {

            if (i % 2 != 0) {
                continue;
            }

            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;

            int foundA = 0;
            int foundB = 0;
            int foundC = 0;

            for (int j = 0; j < digits.length; j++) {

                if (digits[j] == a && foundA == 0) {
                    foundA = 1;
                }
                else if (digits[j] == b && foundB == 0) {
                    foundB = 1;
                }
                else if (digits[j] == c && foundC == 0) {
                    foundC = 1;
                }
            }

            if (foundA == 1 && foundB == 1 && foundC == 1) {
                count++;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna