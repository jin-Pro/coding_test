import sys


def check(num):
    if num == 0:
        if 0 in wrongButton:
            return 0
        else:
            return 1

    length = 0
    while True:
        if num <= 0:
            return length
        if num % 10 in wrongButton:
            return 0
        num = int(num/10)
        length += 1


input = sys.stdin.readline

current = 100

target = int(input())
wrongButtonNum = int(input())
if not wrongButtonNum == 0:
    wrongButton = list(map(int, input().split()))
else:
    wrongButton = []

answer = target - current

if answer < 0:
    answer = -answer

for i in range(1000000):
    length = check(i)
    if length > 0:
        answer = min(answer, abs(target - i)+length)

print(answer)