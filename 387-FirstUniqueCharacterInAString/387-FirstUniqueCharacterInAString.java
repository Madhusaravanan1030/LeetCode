// Last updated: 14/07/2026, 14:31:02
class Solution {
    public int firstUniqChar(String s) 
    {
        for(int i=0;i<s.length();i++)
        {
            char str=s.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++)
            {        
                if(i!=j&&s.charAt(i)==s.charAt(j))
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                return i;
            }
        } 
        return -1;   
    }
}