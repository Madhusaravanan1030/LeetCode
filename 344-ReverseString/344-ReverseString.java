// Last updated: 14/07/2026, 14:31:11
class Solution {
    public void reverseString(char[] s) 
    {
        int n=s.length;
        int i=0,j=n-1;
        while(i<j)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        
        
    }
}