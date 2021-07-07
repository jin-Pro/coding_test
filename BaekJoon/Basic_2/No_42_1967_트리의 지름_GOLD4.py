import sys

sys.setrecursionlimit(10**7)

def dps(start):

    for i in node[start]:
        next, length = i
        if visit[next]:
            visit[next] = False
            dis[next] = dis[start] + length
            dps(next)


input = sys.stdin.readline

N = int(input())

node = [[] for _ in range(N+1)]
visit = [True] * (N+1)
dis = [0] * (N+1)

for _ in range(N-1):
    parent, child, length = map(int, input().rstrip().split())
    node[parent].append((child, length))
    node[child].append((parent, length))

visit[1] = False
dps(1)

root = dis.index(max(dis))

dis = [0] * (N+1)
visit = [True] * (N+1)

visit[root] = False
dps(root)

print(max(dis))
