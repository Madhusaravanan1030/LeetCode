// Last updated: 14/07/2026, 14:30:39
class Solution {
    public int numberOfSteps(int num) 
    {
        int count=0;
        if(num==0)
        {
            return 0;
        }
        while(num!=0)
        {
            if(num%2==0)
            {
                num=num/2;
                count++;
            }
            else
            {
                num=num-1;
                count++;
            }
        }
        return count;
    }
}