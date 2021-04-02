import sys

input = sys.stdin.readline
num = int(input())

sosu = [True] * 1000001
m = int(1000001 ** 0.5)
for i in range(2, m+1):
    if sosu[i] == True:
        for j in range(i+i, 1000001, i):
            sosu[j] = False
sosu[1] = False

while True:
    if num > 1000000:
        print(1003001)
        exit()

    pallen = True
    if not sosu[num]:
        num += 1
        continue

    num = str(num)
    for i in range(len(num)):
        if num[i] != num[-(i+1)]:
            num = int(num) + 1
            pallen = False
            break
    if not pallen:
        continue
    else:
        print(num)
        exit()