# Last updated: 14/07/2026, 14:31:53
class Solution:
    def mySqrt(self, x: int) -> int:
        low=1
        high=x
        ans=0
        while(low<=high):
            mid=(high+low)//2
            if(mid*mid==x):
                return mid
            elif(mid*mid < x):
                ans=mid
                low=mid+1
            else:
                high=mid-1
        return ans