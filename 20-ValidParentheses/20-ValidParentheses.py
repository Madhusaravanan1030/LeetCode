# Last updated: 14/07/2026, 14:32:19
class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        brackets={
            ')':'(',
            '}':'{',
            ']':'['
        }
        for ch in s:
            if(ch in "({["):
                stack.append(ch)
            else:
                if(not stack or stack.pop()!=brackets[ch]):
                    return False
        return not stack


        