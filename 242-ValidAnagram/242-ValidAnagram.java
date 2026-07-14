// Last updated: 14/07/2026, 14:31:24
class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char arr[]=s.toCharArray();
        char arr1[]=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(arr.length!=arr1.length)
        {
            return false;
        }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr1[i]);
        // }
        
        int i=0;
        while(i<arr.length)
        {
            
            if(arr[i]==arr1[i])
            {
                i++;
            }
            else
            {
                return false;
            }
        }
    return arr.length==i;  
    }
}