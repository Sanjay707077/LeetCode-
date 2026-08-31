class Solution { 
    public int[] nextGreaterElement(int[] nums1, int[] nums2) { 
        
        Stack<Integer> stack = new Stack<Integer>(); 
        int[] result = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) 
        { 
            for(int j = 0; j < nums2.length; j++) 
            { 
                if(nums1[i] == nums2[j]) 
                { 
                    stack.push(-1);

                    for(int k = j + 1; k < nums2.length; k++)
                    {
                        if(nums2[j] < nums2[k])
                        {
                            stack.pop();
                            stack.push(nums2[k]);
                            break;
                        }
                    }
                    break;
                } 
            } 
        } 
 
        for(int i = 0; i < nums1.length; i++) 
        {
            result[i] = stack.get(i);
        }

        return result;
    } 
}