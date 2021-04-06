import sys

input = sys.stdin.readline

numLength = int(input())

num = []

for _ in range(numLength):
    num.append(int(input()))

num.sort()
sum = 0

repeat = True

for i in range(numLength):
    if num[i] > 0:
        break
    if not repeat:
        repeat = True
        continue

    if i+1 >= numLength:
        sum += num[i]
        break
    if num[i+1] > 0:
        sum += num[i]
        break

    sum += (num[i] * num[i+1])
    repeat = False

repeat = True

for i in range(numLength-1, -1, -1):
    if not repeat:
        repeat = True
        continue
    if num[i] < 0:
        break
    if i <= 0:
        sum += num[i]
        break
    if num[i-1] <= 0:
        sum += num[i]
        break

    if num[i-1] == 1:
        sum += num[i]
    else:
        sum += (num[i] * num[i-1])
        repeat = False

print(sum)