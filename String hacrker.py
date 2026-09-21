A = input().strip()

def lps(s, i, j):
    if i > j:
        return 0

    if i == j:
        return 1

    if s[i] == s[j]:
        return 2 + lps(s, i + 1, j - 1)

    return max(lps(s, i + 1, j), lps(s, i, j - 1))

print(lps(A, 0, len(A) - 1))
