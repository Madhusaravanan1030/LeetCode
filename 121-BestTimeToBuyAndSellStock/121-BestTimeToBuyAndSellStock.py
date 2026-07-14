# Last updated: 14/07/2026, 14:31:42
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n=len(prices)
        min=prices[0]
        max_profit=0
        for num in prices:
            if(num<min):
                min=num
            elif(num - min > max_profit):
                max_profit=num-min
        return max_profit