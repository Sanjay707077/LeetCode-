class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1=new int[n];
        int[] arr2= new int[n];
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i<n)
            {
                arr1[i]= nums[i];
            }
            else
            {
                arr2[i-n]=nums[i];
            }
        }
        int r=0;
        for(int j=0;j<n;j++){
           result[r]=arr1[j];
           r++;
           result[r]=arr2[j];
           r++;
        }
        return result;
    }
}