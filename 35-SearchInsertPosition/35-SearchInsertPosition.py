# Last updated: 14/07/2026, 14:32:05
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        flag=False
        for i in range(len(nums)):
            if(nums[i]==target):
                return i
            elif(nums[i]>target and i<len(nums)):
                return i
            elif(i==len(nums)-1):
                flag=True
        if(flag):
            return len(nums)  
