// Last updated: 14/07/2026, 14:31:36
class Solution {
    public String reverseWords(String s) 
    {
        String arr[]=s.trim().split("\\s+");
        int n=arr.length;
        String temp="";
        for(int i=0;i<n/2;i++)
        {
                temp=arr[i];
                arr[i]=arr[n-1-i];
                arr[n-1-i]=temp;

        }
        return String.join(" ",arr);
    }
}