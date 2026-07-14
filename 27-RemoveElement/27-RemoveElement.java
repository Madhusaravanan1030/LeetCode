// Last updated: 14/07/2026, 14:32:15
class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int index=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
            boolean flag=false;
            if(nums[i]==val)
            {
                flag=true;
            }
            if(!flag)
            {
                nums[index]=nums[i];
                index++;
                k++;
            }
            
        }
        return k;
    }
}