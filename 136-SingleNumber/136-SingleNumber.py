# Last updated: 14/07/2026, 14:31:37
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        freq={}
        for n in nums:
            freq[n]=freq.get(n,0)+1
        for key,val in freq.items():
            if(val==1):
                return key 

        