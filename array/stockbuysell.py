class Solution:
    def maxProfit(self, prices):
        minPrice = float('inf')
        maxProfit = 0

        for price in prices:
            # Update minimum buying price
            minPrice = min(minPrice, price)

            # Calculate profit if sold today
            profit = price - minPrice

            # Update maximum profit
            maxProfit = max(maxProfit, profit)

        return maxProfit
