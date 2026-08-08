class Solution {
    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int val = 0;

            char c = s.charAt(i);

            if (c == 'I')
                val = 1;
            else if (c == 'V')
                val = 5;
            else if (c == 'X')
                val = 10;
            else if (c == 'L')
                val = 50;
            else if (c == 'C')
                val = 100;
            else if (c == 'D')
                val = 500;
            else if (c == 'M')
                val = 1000;

            if (i + 1 < s.length()) {

                int next = 0;

                char nextChar = s.charAt(i + 1);

                if (nextChar == 'I')
                    next = 1;
                else if (nextChar == 'V')
                    next = 5;
                else if (nextChar == 'X')
                    next = 10;
                else if (nextChar == 'L')
                    next = 50;
                else if (nextChar == 'C')
                    next = 100;
                else if (nextChar == 'D')
                    next = 500;
                else if (nextChar == 'M')
                    next = 1000;

                if (val < next)
                    total -= val;
                else
                    total += val;

            } else {
                total += val;
            }
        }

        return total;
    }
}
