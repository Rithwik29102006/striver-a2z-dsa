from typing import List

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        prefix_sum = 0
        
        # hashmap to store frequency of prefix sums
        mp = {0: 1}   # important: empty prefix has sum 0
        
        for num in nums:
            prefix_sum += num
            
            # if (prefix_sum - k) exists, add its frequency
            if prefix_sum - k in mp:
                count += mp[prefix_sum - k]
            
            # update hashmap
            mp[prefix_sum] = mp.get(prefix_sum, 0) + 1
        
        return count
