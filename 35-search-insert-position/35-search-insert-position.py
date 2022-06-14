class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        start = 0
        end = len(nums)
        
        while start < end:
            mid = start+ (end-start)//2
            if nums[mid] >= target:
                end = mid
            else:
                start = mid+1
        return end