// Last updated: 14/07/2026, 14:31:31
class Solution {
    public int maximumGap(int[] nums) 
    {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int diff=0;
        Arrays.sort(nums);
        if(n<2)
        {
            return 0;
        }
        for(int i=0;i<n;i++)
        {
                if(i==n-1)
                {
                    break;
                }
                diff=nums[i+1]-nums[i];
                if(diff>max)
                {
                    max=diff;
                }


        }
        return max;   
    }
}