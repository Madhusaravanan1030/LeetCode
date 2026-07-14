// Last updated: 14/07/2026, 14:30:33
class Solution {
    public int maxProduct(int[] nums) 
    {
        int n=nums.length;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        max=(nums[n-1]-1)*(nums[n-2]-1);
        return max;
    }
}