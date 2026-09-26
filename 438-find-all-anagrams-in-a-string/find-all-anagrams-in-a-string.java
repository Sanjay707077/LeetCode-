class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> a = new ArrayList<>();

        int[] countP = new int[26];
        int[] countS = new int[26];

        for(int i = 0; i < p.length(); i++) {
            countP[p.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {

            countS[s.charAt(i) - 'a']++;

            if(i >= p.length()) {
                countS[s.charAt(i - p.length()) - 'a']--;
            }

            if(i >= p.length() - 1) {

                boolean same = true;

                for(int j = 0; j < 26; j++) {

                    if(countP[j] != countS[j]) {
                        same = false;
                        break;
                    }
                }

                if(same) {
                    a.add(i - p.length() + 1);
                }
            }
        }

        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna