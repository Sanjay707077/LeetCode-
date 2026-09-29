class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length/2;i++)
        {
            result[2*i]=nums[i];
            result[2*i+1]=nums[i+n];
        }
        return result;
    }
}