class Solution:
    def intervalIntersection(self, firstList: List[List[int]], secondList: List[List[int]]) -> List[List[int]]:
        answer = []
        i,j = 0,0
        while i < len(firstList) and j < len(secondList):
            #넓은범위
            if secondList[j][1] >= firstList[i][0]:
                left = max(firstList[i][0],secondList[j][0])
                right = min(firstList[i][1],secondList[j][1])
                #교집합이 있을때만 append
                if left <= right:
                    answer.append([left,right])
            if firstList[i][1] < secondList[j][1]:
                i += 1
            else:
                j += 1
        return answer