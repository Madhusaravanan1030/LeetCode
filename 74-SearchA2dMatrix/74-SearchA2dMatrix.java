// Last updated: 14/07/2026, 14:31:48
class Solution {
    public boolean searchMatrix(int[][] matrix,int target) 
    {
        boolean flag=false;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(target==matrix[i][j])
                {
                    return true;
                }
                else if(matrix[i][j]>target)
                {
                    flag=true;
                }
            }
            if(flag)
            {
                break;
            }
        }
        return false;
    }
}