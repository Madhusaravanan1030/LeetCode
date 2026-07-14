# Last updated: 14/07/2026, 14:32:14
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        k=1
        for i in range(1,len(nums)):
            if nums[i]!=nums[k-1]:
                nums[k]=nums[i]
                k+=1
        return k
        