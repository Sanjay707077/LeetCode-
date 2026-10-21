class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        for(int i=0;i<height.length;i++)
        {
            int n=height[l];
            int m=height[r];
            int s=0;
            if(n<m || n==m)
            {
                s=n*(r-l);
            }
            else
            {
                s=m*(r-l);
            }

            if(s>max)
            {
                max=s;
            }
            if(n<m || n==m)
            {
                l++;
            }
            else
            {
                r--;
            }

        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna