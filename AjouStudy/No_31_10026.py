import sys
from collections import deque


def solve(x, y):
    q = deque()
    q.append([x, y])

    while q:
        a, b = q.popleft()

        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]

            if 0 <= nx < num and 0 <= ny < num and visit[nx][ny] and color[a][b] == color[nx][ny]:
                q.append([nx, ny])
                visit[nx][ny] = False


input = sys.stdin.readline

num = int(input())

color = [list(input().rstrip()) for _ in range(num)]

visit = [[True] * num for _ in range(num)]

# 북 동 남 서
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

count = 0
count2 = 0

for i in range(num):
    for j in range(num):
        if visit[i][j]:
            visit[i][j] = False
            solve(i, j)
            count += 1

for i in range(num):
    for j in range(num):
        if color[i][j] == 'G':
            color[i][j] = 'R'

visit = [[True] * num for _ in range(num)]

for i in range(num):
    for j in range(num):
        if visit[i][j]:
            visit[i][j] = False
            solve(i, j)
            count2 += 1

print(count, count2)
