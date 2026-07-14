# Last updated: 14/07/2026, 14:32:10
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        if not nums:
            return 0
        k=0
        for i in range(0,len(nums)):
            if(nums[i]!=val):
                nums[k]=nums[i]
                k+=1
        return k
        