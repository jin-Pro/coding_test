import sys


def findLocation():
    answer = []

    for i in range(N):
        for j in range(M):
            if board[i][j] == 'o':
                answer.append((i, j))
                board[i][j] = '.'

    return answer


def coinMoveJudge(x_1, y_1, x_2, y_2):
    if 0 <= x_1 < N and 0 <= y_1 < M and 0 <= x_2 < N and 0 <= y_2 < M:
        return True
    return False


def countFallCoin(x, y):
    if x == -1 or x == N or y == -1 or y == M:
        return True
    return False


def dfs(location, depth):
    if depth == 11:
        return -1

    # location을 받아서 coin 좌표 추출
    coin1_x, coin1_y = location[0]
    coin2_x, coin2_y = location[1]

    answer = []

    for i in range(4):
        # coin을 움직인다
        coin1_cx = coin1_x + dx[i]
        coin1_cy = coin1_y + dy[i]
        coin2_cx = coin2_x + dx[i]
        coin2_cy = coin2_y + dy[i]

        # coin이 떨어지지않았다.
        if coinMoveJudge(coin1_cx, coin1_cy, coin2_cx, coin2_cy):
            if board[coin1_cx][coin1_cy] == '#':
                coin1_cx -= dx[i]
                coin1_cy -= dy[i]
            if board[coin2_cx][coin2_cy] == '#':
                coin2_cx -= dx[i]
                coin2_cy -= dy[i]

            # coin이 합쳐졌을 때
            if coin1_cx == coin2_cx and coin1_cy == coin2_cy:
                ans = -1
            else:
                ans = dfs([(coin1_cx, coin1_cy), (coin2_cx, coin2_cy)], depth+1)

            # 오류가 아니라면 answer에 넣는다.
            if not ans == -1:
                answer.append(ans)

        # coin이 떨어졌다.
        else:
            count = 0

            # 떨어진 코인 count
            if countFallCoin(coin1_cx, coin1_cy):
                count += 1
            if countFallCoin(coin2_cx, coin2_cy):
                count += 1

            if count == 1:
                answer.append(depth)

    # 모든 결과들이 오류라면 -1 반환
    if not answer:
        answer.append(-1)
    return min(answer)


input = sys.stdin.readline

N, M = map(int, input().split(' '))

board = [list(input().rstrip()) for _ in range(N)]

# o 동전
# . 빈칸
# # 벽

coin = findLocation()

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

ans = dfs(coin, 1)

print(ans)
