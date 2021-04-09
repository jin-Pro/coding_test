import sys

input = sys.stdin.readline

N, K = map(int, input().split())

num = list(input().rstrip())

answer = []
answer.append(num[0])

count = 1
digit = 0
delete = 0

while True:
    if count == N:
        break
    if digit == -1:
        target = num[count]
    else:
        target = answer[digit]

    if target < num[count] and delete < K:
        answer.pop()
        digit -= 1
        delete += 1
    else:
        digit += 1
        answer.append(num[count])
        count += 1


while True:
    if len(answer) <= N-K:
        break
    answer.pop()

print(''.join(answer))
