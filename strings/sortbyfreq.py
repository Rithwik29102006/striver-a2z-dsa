class Solution:
    def frequencySort(self, s: str) -> str:
        # Step 1: Frequency count
        freq = {}
        for ch in s:
            freq[ch] = freq.get(ch, 0) + 1
        
        # Step 2: Create buckets
        buckets = [[] for _ in range(len(s) + 1)]
        for ch, count in freq.items():
            buckets[count].append(ch)
        
        # Step 3: Build result from high to low frequency
        result = []
        for count in range(len(buckets) - 1, 0, -1):
            for ch in buckets[count]:
                result.append(ch * count)
        
        return "".join(result)
