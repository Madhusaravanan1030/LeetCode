// Last updated: 14/07/2026, 14:32:20
class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(nums[i]==nums[j])
                {
                    flag=true;
                }
            }
            if(!flag)
            {
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}