# Last updated: 14/07/2026, 14:31:28
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen=set()
        for n in nums:
            if n in seen:
                return True
            seen.add(n)
        return False
        