import sys
from collections import deque


def setting(stone, H, W):
    for i in range(W):
        for j in range(H-1, -1, -1):
            if stone[j][i] == 0:
                for k in range(j-1, 0, -1):
                    stone[k+1][i] = stone[k][i]


def cal(stone, stack):
    for i in stack:
        a, b = i
        stone[a][b] = 0


def recur(x, y, depth, depthLimit, queue, listB, H, W, visit, stone):
    if depth + 1 == depthLimit:
        return

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < H and 0 <= ny < W and visit[nx][ny] and not stone[nx][ny] == 0:
            queue.append([nx, ny, stone[nx][ny]])
            listB.append((nx, ny))
            visit[nx][ny] = False

        if 0 <= nx < H and 0 <= ny < W:
            recur(nx, ny, depth+1, depthLimit,
                  queue, listB, H, W, visit, stone)


def solve(x, y, stone, visit, H, W):
    q = deque()
    q.append([x, y, stone[x][y]])
    listA = []
    listA.append((x, y))

    while q:
        a, b, num = q.popleft()

        recur(a, b, 0, num, q, listA, H, W, visit, stone)

    listA = set(listA)
    return len(listA), listA


def test():
    N, W, H = map(int, input().split())

    stone = [list(map(int, input().split())) for _ in range(H)]

    answerNum = 0

    for _ in range(N):
        answer = 0
        answerList = []
        visit = [[True] * W for _ in range(H)]

        for y in range(W):

            for x in range(H):
                if not stone[x][y] == 0:
                    print("x,y :", x, y)
                    count, stack = solve(x, y, stone, visit, H, W)
                    print("count :", count)
                    print("stack :", stack)
                    break

            if answer < count:
                answer = count
                answerList = stack
        answerNum += answer

        cal(stone, stack)
        setting(stone, H, W)
    realAnswer = 0
    for i in stone:
        realAnswer += i.count(0)

    return answerNum


input = sys.stdin.readline

TESTCASE = int(input())

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

for _ in range(TESTCASE):
    print(test())
