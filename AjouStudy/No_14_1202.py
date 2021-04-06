import sys
import heapq
input = sys.stdin.readline

diaNum, bagNum = map(int, input().split())

dia = []
bag = []
ru = []

sum = 0

for _ in range(diaNum):
    diaWeight, diaValue = map(int, input().split())
    dia.append([diaWeight,diaValue])

dia.sort()
for _ in range(bagNum):
    bag.append(int(input()))

bag.sort()

i = 0
for b in bag:
    while i < diaNum and b >= dia[i][0]:
        heapq.heappush(ru, -dia[i][1])
        i += 1
    if ru:
        sum += heapq.heappop(ru)

print(-sum)