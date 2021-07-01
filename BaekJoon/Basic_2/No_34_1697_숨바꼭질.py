import sys
from collections import deque


def bfs(num):
    q = deque()
    q.append(num)
    visit[num] = False
    dx = [-1, 1, 2]

    while q:
        x = q.popleft()
        length = path[x]

        for i in range(3):
            if i == 2:
                cx = 2*x
            else:
                cx = x + dx[i]

            if 0 <= cx < MaxNum:
                if visit[cx]:
                    visit[cx] = False
                    path[cx] = length+1
                    q.append(cx)
                elif path[cx] > length+1:
                    path[cx] = length+1
                    q.append(cx)


input = sys.stdin.readline

N, K = map(int, input().split())
MaxNum = 100001

path = [0] * (MaxNum)
visit = [True] * (MaxNum)

bfs(N)

print(path[K])
