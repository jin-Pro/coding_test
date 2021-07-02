import sys
from collections import deque


def bfs(num):
    q = deque()
    q.append(num)
    visit[num] = False
    dx = [-1, 1, 2]
    path[num] = [-1]
    while q:
        x = q.popleft()
        length = distance[x]

        for i in range(3):
            if i == 2:
                cx = 2*x
            else:
                cx = x + dx[i]

            if 0 <= cx < MaxNum:
                if visit[cx]:
                    visit[cx] = False
                    distance[cx] = length+1
                    path[cx].append(x)
                    q.append(cx)
                elif distance[cx] > length+1:
                    distance[cx] = length+1
                    q.append(cx)
                    del path[cx]
                    path[cx].append(x)


input = sys.stdin.readline

N, K = map(int, input().split())

if N > K:
    MaxNum = N
else:
    MaxNum = K

if MaxNum * 3 > 100001:
    MaxNum = 100001
else:
    MaxNum = MaxNum * 3


distance = [0] * (MaxNum)
path = [[] for _ in range(MaxNum)]
visit = [True] * (MaxNum)

if N > K:
    print(N-K)

    for i in range(N, K-1, -1):
        print(i, end=' ')
else:
    bfs(N)

    target = K
    answer = str(K)

    print(distance[K])

    while True:
        if target == N:
            break
        answer = str(path[target][0]) + ' ' + answer
        target = path[target][0]

    print(answer)
