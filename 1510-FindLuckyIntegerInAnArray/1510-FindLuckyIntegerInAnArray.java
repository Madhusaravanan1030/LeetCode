// Last updated: 14/07/2026, 14:30:31
class Solution {
    public int findLucky(int[] arr) 
    {
        int n=arr.length;
        int max=-1;
        int count=0;
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(arr[i]>max&&count==arr[i])
            {
                max=arr[i]; 
                 
            }
        count=0; 
        }

        return max;   
    }
}