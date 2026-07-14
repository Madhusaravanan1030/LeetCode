// Last updated: 14/07/2026, 14:30:43
class Solution {
    public int subtractProductAndSum(int n) 
    {
        int prod=1,sum=0;
        while(n!=0)
        {
            int digits=n%10;
            prod=prod*digits;
            sum=sum+digits;
            n=n/10;
        } 
        return prod-sum;  
    }
}