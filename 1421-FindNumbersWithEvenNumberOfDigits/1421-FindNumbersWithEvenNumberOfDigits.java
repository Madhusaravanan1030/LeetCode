// Last updated: 14/07/2026, 14:30:40
class Solution {
    public int findNumbers(int[] nums) 
    {
        int count=0;
        int digits=0;
        for(int n:nums)
        {
            while(n!=0)
            {
                n=n/10;
                digits++;
            }
            if(digits%2==0)
            {
                count++;
            }
            digits=0;
        }
        return count;   
    }
}