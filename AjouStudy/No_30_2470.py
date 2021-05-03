import sys

input = sys.stdin.readline

N = int(input())

dragon_aeck = list(map(int, input().split()))

dragon_aeck.sort()

leftStart = 0
rightStart = N-1
answer = 2000000000

while True:
    if leftStart >= rightStart or answer == 0:
        break
    compareAnswer = dragon_aeck[leftStart] + dragon_aeck[rightStart]
    if answer > abs(compareAnswer):
        answer = abs(compareAnswer)
        left = leftStart
        right = rightStart
    if compareAnswer > 0:
        rightStart -= 1
    else:
        leftStart += 1

print(dragon_aeck[left], dragon_aeck[right])
