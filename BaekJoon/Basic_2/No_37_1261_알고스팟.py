import sys
from collections import deque


def bfs():

    q = deque()
    q.append((0, 0))
    visit[0][0] = False

    dx = [-1, 0, 0, 1]
    dy = [0, 1, -1, 0]

    while q:
        x, y = q.popleft()

        for i in range(4):
            cx = x + dx[i]
            cy = y + dy[i]

            if 0 <= cx < N and 0 <= cy < M:
                if visit[cx][cy]:
                    if board[cx][cy] == 1:
                        dp[cx][cy] = dp[x][y] + 1
                    else:
                        dp[cx][cy] = dp[x][y]

                    visit[cx][cy] = False
                    q.append((cx, cy))
                else:
                    if board[cx][cy] == 1 and dp[cx][cy] > dp[x][y] + 1:
                        dp[cx][cy] = dp[x][y] + 1
                        q.append((cx, cy))

                    elif dp[cx][cy] > dp[x][y] and board[cx][cy] == 0:
                        dp[cx][cy] = dp[x][y]
                        q.append((cx, cy))


M, N = map(int, input().split())

board = [list(map(int, input())) for _ in range(N)]

visit = [[True] * M for _ in range(N)]

dp = [[0] * M for _ in range(N)]

bfs()

print(dp[N-1][M-1])
