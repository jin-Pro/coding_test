from collections import deque
import sys


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

            if 0 <= nx < N and 0 <= ny < M and visit[nx][ny] and ground[nx][ny] == 1:
                q.append([nx, ny])
                stack.append([nx, ny])
                visit[nx][ny] = False

    return stack


def findLand():
    global N, M

    visit = [[True] * M for _ in range(N)]

    for i in range(N):
        for j in range(M):
            if ground[i][j] == 1 and visit[i][j]:
                smallLand = landSolve(i, j, visit)
                if smallLand:
                    land.append(smallLand)


def arriveLand(a, b):
    for i in range(len(land)):
        if [a, b] in land[i]:
            return i


def getBridge():
    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]

    for i in range(len(land)):
        for j in land[i]:
            x, y = j

            for k in range(4):
                dis = -1
                nx = x
                ny = y
                while True:
                    if 0 > nx or nx >= N or 0 > ny or ny >= M:
                        dis = NoBridge
                        break
                    dis += 1
                    nx = nx + dx[k]
                    ny = ny + dy[k]
                    if 0 <= nx < N and 0 <= ny < M and ground[nx][ny] == 1:
                        if dis <= 1:
                            dis = NoBridge
                        break
                if dis < NoBridge:
                    arrive = arriveLand(nx, ny)
                    if dis < bridge[i][arrive]:
                        bridge[i][arrive] = dis


def union(a, b, parent):
    a = find(a, parent)
    b = find(b, parent)

    if a < b:
        parent[b] = a
    else:
        parent[a] = b


def find(x, parent):
    if not x == parent[x]:
        parent[x] = find(parent[x], parent)
    return parent[x]


def cal(stack):
    parent = [i for i in range(landNum)]

    for i in range(0, len(stack), 2):
        union(stack[i], stack[i+1], parent)

    answer = set()

    for i in range(landNum):
        answer.add(find(parent[i], parent))

    if len(answer) == 1:
        return True
    return False


def solve(depth, landSet, count):
    if len(set(landSet)) == landNum and cal(landSet):
        return count

    if depth == landNum-1:
        return NoBridge

    answer = NoBridge
    compNum = NoBridge

    for i in range(landNum+1):
        if i == landNum:
            compNum = solve(depth+1, landSet, count)
        elif not bridge[depth+1][i] == NoBridge:
            landSet.append(depth+1)
            landSet.append(i)
            compNum = solve(depth+1, landSet, count + bridge[depth+1][i])
            landSet.pop()
            landSet.pop()
        answer = min(answer, compNum)

    return answer


input = sys.stdin.readline

N, M = map(int, input().split())

ground = [list(map(int, input().split())) for _ in range(N)]

NoBridge = 99999

land = []

findLand()

landNum = len(land)

bridge = [[NoBridge] * landNum for _ in range(landNum)]

getBridge()

EXIT = False
for i in bridge:
    num = min(i)
    if num == NoBridge:
        EXIT = True
        break

if EXIT:
    print(-1)
else:
    answer = NoBridge
    count = NoBridge
    listA = []

    for i in range(landNum+1):
        if i == landNum:
            count = solve(0, listA, 0)
        elif not bridge[0][i] == NoBridge:
            listA.append(0)
            listA.append(i)
            count = solve(0, listA, bridge[0][i])
            listA.remove(0)
            listA.remove(i)

        answer = min(answer, count)
    if answer == NoBridge:
        print(-1)
    else:
        print(answer)
