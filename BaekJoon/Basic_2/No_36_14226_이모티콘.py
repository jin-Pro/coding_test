import sys
from collections import deque


def bfs(start):
    q = deque()
    q.append([0, start, 0])
    visit[start][0] = False

    while q:
        time, x, copy = q.popleft()

# 복사/붙이기/지우기
        if x == N:
            print(time)
            break

        for i in range(3):
            if i == 0 and visit[x][x]:
                visit[x][x] = False
                q.append([time+1, x, x])

            if i == 1:
                cx = x + copy
                if 0 <= cx < maxNum and visit[cx][copy]:
                    visit[cx][copy] = False
                    q.append([time+1, cx, copy])
            if i == 2:
                cx = x - 1
                if 0 <= cx < maxNum and visit[cx][copy]:
                    visit[cx][copy] = False
                    q.append([time+1, cx, copy])


input = sys.stdin.readline

N = int(input())
maxNum = 2*N + 1

visit = [[True] * maxNum for _ in range(maxNum)]
bfs(1)
