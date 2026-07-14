// Last updated: 14/07/2026, 14:31:41
class Solution {
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        StringBuilder p=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if((c>=97&&c<=122)||(c>=48&&c<=57))
            p.append(c);
        };
        int i=0;
        int j=p.length()-1;
        while(i<j)
        {
            if(p.charAt(i)!=p.charAt(j))
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;   
    }
}