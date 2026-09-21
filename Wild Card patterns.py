import sys

def solve():
    input_data = sys.stdin.read().split()
    if not input_data:
        return
    
    s = input_data[0]
    p = input_data[1]
    
    s_len, p_len = len(s), len(p)
    s_idx, p_idx = 0, 0
    star_idx = -1
    match_idx = -1
    
    while s_idx < s_len:
        
        
        if p_idx < p_len and (p[p_idx] == '?' or p[p_idx] == s[s_idx]):
            s_idx += 1
            p_idx += 1
        
        elif p_idx < p_len and p[p_idx] == '*':
            star_idx = p_idx
            match_idx = s_idx
            p_idx += 1
        
        elif star_idx != -1:
            p_idx = star_idx + 1
            match_idx += 1
            s_idx = match_idx
        
        else:
            print(0)
            return

    
    while p_idx < p_len and p[p_idx] == '*':
        p_idx += 1

    
    if p_idx == p_len:
        print(1)
    else:
        print(0)

if __name__ == '__main__':
    solve()
