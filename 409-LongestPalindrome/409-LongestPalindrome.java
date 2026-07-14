// Last updated: 14/07/2026, 14:31:00
class Solution {
    public int longestPalindrome(String s) 
    {
        int fre[]=new int[128];
        for(char c:s.toCharArray())
        {
            fre[c]++;
        }
        boolean flag=false;
        int len=0;
        for(int i=0;i<128;i++)
        {
            int f=fre[i];
            len+=(f/2)*2;
            if(!(f%2==0))
            {
                if(!(flag))
                {
                    flag=true;
                }
            }
        }
        if(flag)
        {
            len+=1;
        }
        return len;
    }
}