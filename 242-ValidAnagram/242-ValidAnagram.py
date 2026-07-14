# Last updated: 14/07/2026, 14:31:21
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        arr = sorted(s)
        arr1 = sorted(t)

        if len(arr) != len(arr1):
            return False

        i = 0
        while i < len(arr):
            if arr[i] == arr1[i]:
                i += 1
            else:
                return False

        return len(arr) == i
        