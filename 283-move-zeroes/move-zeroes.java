class Solution {
    public void moveZeroes(int[] nums) {
        int z=0;
        for(int i=0;i<nums.length;i++)
    {
        if((nums[i]==0))
        {
            z++;
        }
    }
        int k=0;
        for(int j=0;j<nums.length;j++)
        {
            if(!(nums[j]==0))
            {
                nums[k]=nums[j];
                k++;
            }
        }
        for(int j=k;j<k+z;j++)
        {
            nums[j]=0;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna