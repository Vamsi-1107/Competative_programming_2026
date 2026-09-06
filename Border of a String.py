s = input().strip()

pi = [0] * len(s)
j = 0

for i in range(1, len(s)):
    while j > 0 and s[i] != s[j]:
        j = pi[j - 1]
    if s[i] == s[j]:
        j += 1
    pi[i] = j

k = pi[-1]

if k == 0:
    print("")
else:
    print(s[:k])
