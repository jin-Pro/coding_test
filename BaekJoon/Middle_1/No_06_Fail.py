import sys


def getDominoLocation():

    answer = []

    for x in range(1, 10):
        for y in range(1, 10):
            if board[x][y] == 0:
                count = 0
                targetX = 0
                targetY = 0

                for i in range(4):
                    cx = x + dx[i]
                    cy = y + dy[i]

                    if 1 <= cx <= 9 and 1 <= cy <= 9 and board[cx][cy] == 0:
                        count += 1
                        targetX = cx
                        targetY = cy

                if count == 1:
                    answer.append([(targetX, targetY), (x, y)])
    return answer


def inputPossibleBoard():
    for i in range(1, 10):
        for j in range(1, 10):
            if board[i][j] == 0:
                inputBoard(i, j)
            else:
                possibleBoard[i][j] = []


def inputBoard(x, y):
    for i in range(1, 10):
        # 가로 방향
        if board[x][i] in possibleBoard[x][y]:
            possibleBoard[x][y].remove(board[x][i])
        # 세로방향
        if board[i][y] in possibleBoard[x][y]:
            possibleBoard[x][y].remove(board[i][y])

    # 9개 칸 확인
    start_x = ((x-1) // 3)*3 + 1
    start_y = ((y-1) // 3)*3 + 1

    for i in range(start_x, start_x+3):
        for j in range(start_y, start_y+3):
            if board[i][j] in possibleBoard[x][y]:
                possibleBoard[x][y].remove(board[i][j])


def solve():


input = sys.stdin.readline

dx = [1, 0, -1, 0]
dy = [0, -1, 0, 1]

while True:
    N = int(input())

    if N == 0:
        break

    board = [[0] * (10) for _ in range(10)]
    domino = [[] for _ in range(10)]

    for i in range(1, 9):
        for j in range(i+1, 10):
            domino[i].append(j)
            domino[j].append(i)

    for _ in range(N):
        value, location, value2, location2 = list(input().rstrip().split(' '))
        value = int(value)
        value2 = int(value2)
        x = ord(location[0])-64
        y = int(location[1])
        x2 = ord(location2[0])-64
        y2 = int(location2[1])

        board[x][y] = value
        board[x2][y2] = value2

        if value > value2:
            temp = value
            value = value2
            value2 = temp

        domino[value].remove(value2)
        domino[value2].remove(value)

    line = list(input().rstrip().split(' '))

    for i in range(1, 10):
        x = ord(line[i-1][0])-64
        y = int(line[i-1][1])

        board[x][y] = i

    dominoLocation = getDominoLocation()

    possibleBoard = [[[1, 2, 3, 4, 5, 6, 7, 8, 9]
                      for _ in range(10)] for _ in range(10)]

    inputPossibleBoard()

    flag = False
    flag2 = False

    while True:
        for i in range(1, 10):
            for j in range(1, 10):
                # // possibleBoard[x][y] 의 길이가 1개라면
                if len(possibleBoard[i][j]) == 1:
                    # // board[x][y]에 possibleBoard[x][y] 값 넣어주고
                    board[i][j] = possibleBoard[i][j][0]
                    flag = True
                    inputPossibleBoard()
                    break
            if flag:
                flag = False
                break

            if i == 9 and j == 9:
                flag2 = True

        if flag2:
            break

    for (firstX, firstY), (secondX, secondY) in dominoLocation:
        value = board[firstX][firstY]
        value2 = board[secondX][secondY]

        if not value == 0 and not value2 == 0:
            if value2 in domino[value]:
                domino[value].remove(value2)
                domino[value2].remove(value)

    solve()

    for i in range(1, 10):
        for j in range(1, 10):
            print(possibleBoard[i][j], end=' ')
        print()

    for i in range(1, 10):
        for j in range(1, 10):
            print(board[i][j], end=' ')
        print()

    for i in range(1, 10):
        print(domino[i])
