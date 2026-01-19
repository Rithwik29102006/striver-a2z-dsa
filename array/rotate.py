class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        n = len(nums)
        k = k % n  # handle large k

        # helper function to reverse part of array
        def reverse(left, right):
            while left < right:
                nums[left], nums[right] = nums[right], nums[left]
                left += 1
                right -= 1

        # step 1: reverse whole array
        reverse(0, n - 1)

        # step 2: reverse first k elements
        reverse(0, k - 1)

        # step 3: reverse remaining elements
        reverse(k, n - 1)
