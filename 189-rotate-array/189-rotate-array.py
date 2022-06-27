class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n=len(nums)
        k=k%n
        if k==0:
            pass
        else:
            nums[:] = nums[-k:]+nums[:n-k]
        
        