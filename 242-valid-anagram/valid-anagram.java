class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> set = new HashMap<>();
        HashMap<Character,Integer> map = new HashMap<>();

        for(Character x : s.toCharArray())
        {
            set.put(x, set.getOrDefault(x, 0) + 1);
        }

        for(Character x : t.toCharArray())
        {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        if(set.equals(map))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna