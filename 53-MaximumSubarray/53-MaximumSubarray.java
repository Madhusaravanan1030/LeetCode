// Last updated: 14/07/2026, 14:32:01
class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int max=0;
        int finmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(arr[i],arr[i]+max);
            finmax=Math.max(max,finmax);
        }
        return finmax;
    }
}