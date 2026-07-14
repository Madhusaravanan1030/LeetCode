# Last updated: 14/07/2026, 14:31:06
class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        i=0
        j=len(s)-1
        temp=0
        while(i<=j):
            temp=s[i]
            s[i]=s[j]
            s[j]=temp
            i+=1
            j-=1

        return s
        