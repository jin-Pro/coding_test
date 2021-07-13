import sys


def dfs(x, y, depth):
    global answer

    if depth > answer:
        answer = depth

    for i in range(4):
        cx = x + dx[i]
        cy = y + dy[i]
        # print("out cx :", cx)
        # print("out cy :", cy)
        if 0 <= cx < R and 0 <= cy < C and alpha[board[cx][cy]] == 0:
            # print("in cx :", cx)
            # print("in cy : ", cy)
            # print("board[cx][cy] :", chr(board[cx][cy]+65))
            alpha[board[cx][cy]] = 1
            dfs(cx, cy, depth+1)
            alpha[board[cx][cy]] = 0


input = sys.stdin.readline

R, C = map(int, input().split(' '))

board = [list(map(lambda x: ord(x)-65, input())) for i in range(R)]

alpha = [0 for _ in range(26)]
dx = [1, 0, -1, 0]
dy = [0, -1, 0, 1]

answer = 1

alpha[board[0][0]] = 1

dfs(0, 0, 1)

print(answer)
