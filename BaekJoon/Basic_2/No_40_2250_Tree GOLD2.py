import sys


def leftMiddleRight(root, level):
    global count
    if not node[root][0] == -1:
        leftMiddleRight(node[root][0], level+1)
    dis[root] = count
    count += 1
    high[level].append(root)

    if not node[root][1] == -1:
        leftMiddleRight(node[root][1], level+1)


input = sys.stdin.readline

N = int(input())

node = [[] for _ in range(N+1)]
dis = [0] * (N+1)
high = [[] for _ in range(N+1)]
root = [0] * (N+1)

for _ in range(N):
    a, b, c = map(int, input().split(' '))
    node[a].append(b)
    node[a].append(c)
    if not b == -1:
        root[b] = a
    if not c == -1:
        root[c] = a

for i in range(1, N+1):
    if root[i] == 0:
        start = i
        break

count = 1
level = 1

leftMiddleRight(start, level)

maxWidth = 1
maxLevel = 1

index = 1
while True:
    if index > N or not high[index]:
        break
    width = dis[high[index][-1]] - dis[high[index][0]]
    if maxWidth < width:
        maxLevel = index
        maxWidth = width
    index += 1

if maxLevel == 1:
    maxWidth -= 1
print(maxLevel, maxWidth+1)
