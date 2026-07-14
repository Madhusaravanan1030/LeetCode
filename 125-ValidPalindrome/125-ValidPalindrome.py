# Last updated: 14/07/2026, 14:31:38
class Solution:
    def isPalindrome(self, s: str) -> bool:
        palindrome=[]
        for ch in s:
            if ch.isalpha() or (ord(ch) >= ord('0') and ord(ch) <= ord('9')):
                palindrome.append(ch.lower())
        i=0
        j=len(palindrome)-1
        print(j)
        while(i<j):
            if(palindrome[i]!=palindrome[j]):
                return False
            i+=1
            j-=1
        return True
        