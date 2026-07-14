// Last updated: 14/07/2026, 14:32:29
class Solution {
    public int reverse(int x) 
    {
        int temp=x;
        long rev=0;
        while(temp!=0)
        {
            int n=temp%10;
            rev=rev*10+n;
            temp/=10;
        }
        // boolean flag=false;
        // if(temp<0)
        // {
        //     temp=-temp;
        //     flag=true;
        // }
        // String st=Long.toString(temp);
        // StringBuilder sb=new StringBuilder(st);
        // sb.reverse();
        // long ans=Long.parseLong(sb.toString());
        // if(flag)
        // {
        //     ans=-ans;
        // }
        if(rev <= Integer.MIN_VALUE || rev >= Integer.MAX_VALUE)
        {
            return 0;
        }
        return (int)rev;
    }
}