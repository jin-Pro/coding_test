import sys
from collections import deque

input = sys.stdin.readline

testCase = int(input())

for _ in range(testCase):
    stack = list(input().rstrip())

    listNum = int(input())
    b = input().rstrip()
    b = b[1:-1].split(",")
    answer = deque()
    for i in b:
        if i == '':
            break
        answer.append(int(i))
    Error = False
    status = True

    for i in stack:
        if i == 'R':
            status = not status
        else:
            if len(answer) == 0:
                Error = True
                break

            if status:
                answer.popleft()
            else:
                answer.pop()
    if Error:
        print("error")
        continue

    if not status:
        answer.reverse()

    realAnswer = '['
    while True:
        if len(answer) == 0:
            break
        realAnswer += str(answer.popleft())
        realAnswer += ','
    if realAnswer != '[':
        realAnswer = realAnswer[:-1]
    realAnswer += ']'

    print(realAnswer)