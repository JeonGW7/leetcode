class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        answer = 0 
        
        while left < right:
            answer = max(answer,(right-left)*min(height[left],height[right]))
            #오른쪽이 왼쪽보다 높으면
            if height[left] <= height[right]:
                tmp = left + 1
                #그다음 높은값 찾음
                while tmp < right and height[tmp] <= height[left]:
                    tmp += 1
                left = tmp
            #왼쪽이 오른쪽보다 높으면 
            else:
                tmp = right - 1
                #그다음 높은값 찾음
                while left < tmp and height[tmp] <= height[right]:
                    tmp -= 1
                right = tmp
                
        return answer