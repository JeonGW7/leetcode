class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        list = []
        if len(nums)>2:
            for i1 in range(len(nums)-2):
                if i1>0 and nums[i1]==nums[i1-1]:
                    continue
                i2 = i1+1
                i3 = len(nums)-1
                while(i2<i3):
                    sum = nums[i1]+nums[i2]+nums[i3]
                    if sum==0:
                        list.append([nums[i1],nums[i2],nums[i3]])
                        i3 -= 1
                        while (i2<i3 and nums[i3]==nums[i3+1]):
                            i3 -= 1
                    elif sum>0:
                        i3 -= 1
                    else:
                        i2 += 1
        return list