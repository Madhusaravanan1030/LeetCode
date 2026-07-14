# Last updated: 14/07/2026, 14:32:04
class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        prod=self.integer(num1)*self.integer(num2)
        return str(prod)
       
    def integer(self,num:str):
        n=0
        for s in num:
            n=n*10 + (ord(s) - ord('0'))
        return n