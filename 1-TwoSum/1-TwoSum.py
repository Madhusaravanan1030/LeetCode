# Last updated: 14/07/2026, 14:32:32
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        start,end=0,0
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if(nums[i]+nums[j]==target):
                    return [i,j]
        

            
        