import sys
from collections import deque


def bfs(start):
    q = deque()
    q.append(start)
    visit[start] = False

    while q:
        x = q.popleft()

        for i in range(3):
            if i == 0:
                cx = x - 1
            elif i == 1:
                cx = x + 1
            elif i == 2:
                cx = 2 * x

            if 0 <= cx < maxNum:
                if visit[cx]:
                    if i == 2:
                        board[cx] = board[x]
                    else:
                        board[cx] = board[x] + 1
                    q.append(cx)
                    visit[cx] = False

                elif board[cx] > board[x]:
                    if i == 2:
                        board[cx] = board[x]
                    else:
                        board[cx] = board[x] + 1
                    q.append(cx)


N, M = map(int, input().split())


if N > M:
    print(N-M)

else:
    maxNum = 2 * (M + 1)

    board = [0] * maxNum
    visit = [True] * maxNum

    bfs(N)

    print(board[M])
