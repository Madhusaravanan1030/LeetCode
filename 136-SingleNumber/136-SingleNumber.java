// Last updated: 14/07/2026, 14:31:40
class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(nums[i]==nums[j])
                    {
                        count++;
                    }
                }
            }
            if(count==0)
            {
                
                return nums[i];
            }
            count=0;
        }
        return -1;
    }
}