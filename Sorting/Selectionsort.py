class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        for i in range(n - 1):
            min1 = i
            for j in range(i + 1, n):
                if nums[j] < nums[min1]:
                    min1 = j
            # swap after inner loop
            nums[i], nums[min1] = nums[min1], nums[i]
        return nums
