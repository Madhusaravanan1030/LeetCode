// Last updated: 14/07/2026, 14:31:34
class Solution {
    public int findPeakElement(int[] nums) 
    {
        int max=Integer.MIN_VALUE;
        int temp=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
                if(nums[i]>max)
                {
                    max=nums[i];
                    temp=i;
                }
            
        }
        return temp;
    }
}