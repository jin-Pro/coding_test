import sys
from collections import deque
from copy import deepcopy
import itertools as it


def findMax(listA):
    answer = 0
    for i in range(N):
        for j in range(N):
            if not listA[i][j] == '*' and not listA[i][j] == '**' and not listA[i][j] == '-':
                maxNum = listA[i][j]
                answer = max(answer, maxNum)
    return answer


def bfs(listA, waitingVirus):
    q = deque()

    for i in waitingVirus:
        a, b, x = i
        listA[a][b] = '**'
        q.append(i)

    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]

    visit2 = [[True] * N for _ in range(N)]

    while q:

        x, y, value = q.popleft()

        if listA[x][y] == '**':
            dis = 1

        elif listA[x][y] == '*':
            dis = value+1

        else:
            dis = listA[x][y] + 1

        visit2[x][y] = False

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < N and 0 <= ny < N and visit2[nx][ny] and not listA[nx][ny] == '-' and not listA[nx][ny] == '**':
                if listA[nx][ny] == '*':
                    q.append([nx, ny, dis])
                elif listA[nx][ny] > dis:
                    listA[nx][ny] = dis
                    q.append([nx, ny, False])

    return findMax(listA)


input = sys.stdin.readline

N, M = map(int, input().split())

lab = [list(map(int, input().split())) for _ in range(N)]


location = []

for i in range(N):
    for j in range(N):
        if lab[i][j] == 2:
            lab[i][j] = '*'
            location.append([i, j, 0])
        if lab[i][j] == 1:
            lab[i][j] = '-'
        if lab[i][j] == 0:
            lab[i][j] = 10000

answer = 10000

for waitingVirus in it.combinations(location, M):
    virtualLab = deepcopy(lab)
    count = bfs(virtualLab, waitingVirus)
    answer = min(answer, count)

if answer == 10000:
    print(-1)
else:
    print(answer)

