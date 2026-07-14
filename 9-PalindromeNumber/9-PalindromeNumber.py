# Last updated: 14/07/2026, 14:32:27
class Solution:
    def isPalindrome(self, x: int) -> bool:
        x=str(x)
        rev=""
        for ch in x:
            rev=ch+rev
        if(rev==x):
            return True
        return False
        