class Solution:
    def rearrangeArray(self, nums):
        n = len(nums)
        ans = [0] * n

        pos = 0   # even index for positives
        neg = 1   # odd index for negatives

        for num in nums:
            if num > 0:
                ans[pos] = num
                pos += 2
            else:
                ans[neg] = num
                neg += 2

        return ans
