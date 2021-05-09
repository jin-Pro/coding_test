import sys
from collections import deque


def landSolve(x, y, visit):
    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]

    q = deque()
    q.append([x, y])
    stack = []
    stack.append([x, y])
    visit[x][y] = False

    while q:
        a, b = q.popleft()

        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]

            if 0 <= nx < N and 0 <= ny < N and visit[nx][ny] and ground[nx][ny] == 1:
                q.append([nx, ny])
                stack.append([nx, ny])
                visit[nx][ny] = False

    return stack


def findLand():
    global N

    visit = [[True] * N for _ in range(N)]

    for i in range(N):
        for j in range(N):
            if ground[i][j] == 1 and visit[i][j]:
                smallLand = landSolve(i, j, visit)
                if smallLand:
                    land.append(smallLand)


def findBorderLand(listA):
    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]

    appendList = []

    for i in listA:
        x, y = i
        for j in range(4):
            nx = x + dx[j]
            ny = y + dy[j]

            appendCheck = False

            if 0 <= nx < N and 0 <= ny < N and ground[nx][ny] == 0:
                appendCheck = True
                break

        if appendCheck:
            appendList.append([x, y])

    return appendList


def getBridge():
    dis = set()

    for i in range(len(borderLand)-1):
        for j in range(i+1, len(borderLand)):
            for k in borderLand[i]:
                x_1, y_1 = k

                for z in borderLand[j]:
                    x_2, y_2 = z

                    count = abs(x_1 - x_2) + abs(y_1 - y_2)
                    dis.add(count-1)
    print(min(dis))


input = sys.stdin.readline

N = int(input())

ground = [list(map(int, input().split())) for _ in range(N)]

land = []

findLand()

borderLand = []

for i in range(len(land)):
    stack = findBorderLand(land[i])
    borderLand.append(stack)

bridge = set()

getBridge()
