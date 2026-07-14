# Last updated: 14/07/2026, 14:31:51
class Solution:
    def climbStairs(self, n: int) -> int:
        a=1
        b=1
        for i in range(2,n+1):
            c=a+b
            a=b
            b=c
        return b