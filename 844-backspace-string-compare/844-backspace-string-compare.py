class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        i1 = len(s) - 1
        i2 = len(t) - 1
        s_cnt,t_cnt = 0,0
        while i1 >=0 or i2 >= 0:
            if (i1 >= 0 and s[i1] == '#') or (i2 >= 0 and t[i2] == '#'):
                if s[i1] == '#':
                    i1 -= 1
                    s_cnt += 1
                if t[i2] == '#':
                    i2 -= 1
                    t_cnt += 1
            else:
                if s_cnt > 0 or t_cnt > 0:
                    if s_cnt > 0:
                        i1 -= 1
                        s_cnt -= 1
                    if t_cnt > 0:
                        i2 -= 1
                        t_cnt -= 1
                else:
                    #문자열 비교
                    if i1>=0 and i2 >=0 and s[i1] == t[i2]:
                        i1 -= 1
                        i2 -= 1
                    else:
                        return False
        return True