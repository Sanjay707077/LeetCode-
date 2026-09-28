class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num= new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            num[i]=nums[i];
        }
        int r=0;
        for(int j=nums.length;j<(nums.length*2)-1;j++)
        {
            num[j]=nums[r];
            r++;
        }
       num[nums.length*2-1]=nums[nums.length-1];
        return num;
        
    }
}