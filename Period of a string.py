s = input().strip()
n = len(s)

pi = [0] * n
j = 0

for i in range(1, n):
    while j > 0 and s[i] != s[j]:
        j = pi[j - 1]
    if s[i] == s[j]:
        j += 1
    pi[i] = j

period = n - pi[-1]

if n % period == 0:
    print(period)
else:
    print(n)
