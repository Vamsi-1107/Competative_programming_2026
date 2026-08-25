n = int(input())
words = input().split(",")
p = input().strip()
ans = []

for w in words:
    abbr = ""
    for ch in w:
        if ch.isupper():
           abbr += ch
    if abbr.startswith(p):
        ans.append((abbr, w))
    ans.sort()
    
if len(ans) == 0:
    print("No match found")
else:
    for abbr, w in ans:
        print(w)
                    
