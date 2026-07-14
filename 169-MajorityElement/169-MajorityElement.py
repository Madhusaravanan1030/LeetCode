# Last updated: 14/07/2026, 14:31:30
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        limit=len(nums)/2
        freq={}
        for n in nums:
            freq[n]=freq.get(n,0)+1
        for key,val in freq.items():
            if val > limit :
                return key
        