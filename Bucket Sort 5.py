n = int(input())
a = list(map(float, input().split()))

buckets = [[] for _ in range(n)]

for x in a:
    index = int(x * n)
    if index >= n:
        index = n - 1
    buckets[index].append(x)

for bucket in buckets:
    bucket.sort()

result = []

for bucket in buckets:
    result.extend(bucket)

for x in result:
    if x.is_integer():
        print(int(x), end=" ")
    else:
        print(f"{x:.2f}", end=" ")
