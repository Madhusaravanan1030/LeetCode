// Last updated: 14/07/2026, 14:30:37
class Solution {
    public boolean checkIfExist(int[] arr) 
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(arr[i]==arr[j]*2)
                {
                    return true;
                }
            }
        }
        return false;
    }
}