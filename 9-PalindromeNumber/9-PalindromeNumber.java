// Last updated: 14/07/2026, 14:32:30
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        if(x<0)
        return false;
        while(temp>0)
        {
            int dig=temp%10;
            rev=rev*10+dig;
            temp=temp/10;

        }
        if(rev==x)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}