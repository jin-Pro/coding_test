import sys


def dfs(depth, marble):
    if depth > 10:
        return -1

    red, blue = marble
    rx, ry = red
    bx, by = blue

    answer = []

    for i in range(4):
        crx = rx + dx[i]
        cry = ry + dy[i]
        cbx = bx + dx[i]
        cby = by + dy[i]

        redMove = True
        blueMove = True

# 벽에 만났을때 stop
# 다른 구슬이 있을때
#  같이 이동하고있을때
#  하나의 구술이 멈추었고 그때 내가 이동하려할때
        stop = False

        while True:
            # // blue가 홀에 들어갔거나
            if board[cbx][cby] == 'O':
                ans = -1
                stop = True
                break

            if redMove and board[crx][cry] == '#':
                redMove = False
                crx = crx - dx[i]
                cry = cry - dy[i]

            if blueMove and board[cbx][cby] == '#':
                blueMove = False
                cbx = cbx - dx[i]
                cby = cby - dy[i]

            if not redMove and blueMove and crx == cbx and cry == cby:
                cbx = cbx - dx[i]
                cby = cby - dy[i]
                blueMove = False

            if not blueMove and redMove and crx == cbx and cry == cby:
                crx = crx - dx[i]
                cry = cry - dy[i]
                redMove = False

            # // 진행 도충 red가 홀에 들어갔거나
            if board[crx][cry] == 'O':
                redMove = False
                if not blueMove:
                    return depth

            # //조건 둘다 벽에 막혀서 이동 못하면 다음 for문
            if not redMove and not blueMove:
                newMarble = [(crx, cry), (cbx, cby)]
                break

            if redMove:
                crx = crx + dx[i]
                cry = cry + dy[i]
            if blueMove:
                cbx = cbx + dx[i]
                cby = cby + dy[i]
        if not stop:
            ans = dfs(depth+1, newMarble)

        if not ans == -1:
            answer.append(ans)

    if answer == []:
        answer.append(-1)

    return min(answer)


input = sys.stdin.readline

N, M = map(int, input().split(' '))

board = [list(input().rstrip()) for _ in range(N)]

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

for i in range(N):
    for j in range(M):
        if board[i][j] == 'O':
            hole_x = i
            hole_y = j
        if board[i][j] == 'R':
            red_x = i
            red_y = j
        if board[i][j] == 'B':
            blue_x = i
            blue_y = j

circle = [(red_x, red_y), (blue_x, blue_y)]

ans = dfs(1, circle)

print(ans)
