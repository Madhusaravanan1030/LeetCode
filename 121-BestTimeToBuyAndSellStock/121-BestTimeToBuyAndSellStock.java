// Last updated: 14/07/2026, 14:31:47
class Solution 
{
    public int maxProfit(int[] arr) 
    {
        int buy=arr[0];
        int max=0;
        // int min=Integer.MAX_VALUE;
        
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]<min)
        //     {
        //         min=arr[i];
        //     }
        //     else if(arr[i]-min>max)
        //     {
        //         max=arr[i]-min;
        //     }
        // }
        // return max;
        for(int i=1;i<arr.length;i++)
        {
            if(buy>arr[i])
            {
                buy=arr[i];
            }
            else
            {
                int p=arr[i]-buy;
                if(max<p)
                {
                    max=p;
                }
            }
        }
return max;
    }
}