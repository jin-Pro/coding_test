import sys
import heapq

input = sys.stdin.readline

cardNum = int(input())
cardList = []

for _ in range(cardNum):
    heapq.heappush(cardList, int(input()))

sum = 0
while True:
    first = heapq.heappop(cardList)
    if not cardList:
        print(sum)
        break

    second = heapq.heappop(cardList)
    addCard = first + second
    sum += addCard
    heapq.heappush(cardList, addCard)
