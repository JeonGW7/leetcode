class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        f1 = Counter(s1)
        l1 = len(s1)
        for i in range(len(s2) - (l1 - 1)):
            if f1 == Counter(s2[i : i + l1]):
                return True
        return False