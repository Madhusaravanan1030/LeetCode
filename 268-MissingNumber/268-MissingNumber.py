# Last updated: 14/07/2026, 14:31:14
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        sort=sorted(nums)
        n=len(nums)
        for i in range(n):
            if sort[i]!=i:
                return i
        return n
        