class Solution {
    public int[] runningSum(int[] nums) {
        ArrayList<Integer> set= new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            set.add(sum);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}