class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        string =""
        length, maxlength = 0, 0
        
        for char in s:
            if char in string:
                string = string[string.index(char) + 1:] + char
        
            else:
                string += char
                length = len(string)
                
            
            maxlength = max(length, maxlength)
        
        return maxlength