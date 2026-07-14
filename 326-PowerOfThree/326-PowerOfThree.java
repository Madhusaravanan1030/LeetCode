// Last updated: 14/07/2026, 14:31:07
class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n<=0)
        {
            return false;
        }

        while(n%3==0)
        {
            n=n/3;
        }
    return n==1;    
    }
}