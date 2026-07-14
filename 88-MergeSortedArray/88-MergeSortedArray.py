# Last updated: 14/07/2026, 14:31:44
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        j=0
        for i in range(m,m+n):
            nums1[i]=nums2[j]
            j+=1
        for i in range(len(nums1)):
            for j in range(len(nums1)-i-1):
                if(nums1[j] > nums1[j+1]):
                    nums1[j],nums1[j+1]=nums1[j+1],nums1[j]

            
    