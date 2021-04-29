import sys
from collections import deque

def solve(s, a, m):
    q = deque()
    q.append(s)
    visit[s] = False
    while q:
        start = q.popleft()
        if a == start:
            return True
        for arrive, distance in neighList[start]:
            if m <= distance and visit[arrive]:
                q.append(arrive)
                visit[arrive] = False

    return False


input = sys.stdin.readline

N, M = map(int, input().split())

neighList = [[] for _ in range(N+1)]

for i in range(M):
    a, b, c = map(int, input().split())
    neighList[a].append([b, c])
    neighList[b].append([a, c])


s, a = map(int, input().split())

low, high = 1, 1000000000

while low <= high:
    visit = [[True] for _ in range(N+1)]
    mid = (low + high)//2
    if solve(s, a, mid):
        low = mid + 1
    else:
        high = mid - 1

print(high)
