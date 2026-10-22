class Solution {
    public void sortColors(int[] nums) {

        int r=0;
        int w=0;
        int b=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
        {
            r++;
        }
        else if(nums[i]==1)
        {
            w++;
        }
        else
        {
            b++;
        }
       }
        int k=0;
       for(int j=0;j<r;j++)
       {
            nums[j]=0;
            k++;
       }
       for(int j=k;j<r+w;j++)
       {
        nums[j]=1;
        k++;
       }
       for(int j=k;j<r+w+b;j++)
       {
        nums[j]=2;
        k++;
       }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna