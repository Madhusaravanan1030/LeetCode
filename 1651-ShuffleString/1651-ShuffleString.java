// Last updated: 14/07/2026, 14:30:36
class Solution {
    public String restoreString(String s, int[] indices) 
    {
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int index=indices[i];
            arr[index]=s.charAt(i);
        }

        return new String(arr);
    }
}