def solve(n):
    sum = n

    for i in range(len(str(n))):
        sum += int(str(n)[i])

    return sum
num = []

for i in range(1,10000 + 1):
    num.append(solve(i))

for i in range(1,10000 + 1):
    if i in num:
        continue
    print(i)  