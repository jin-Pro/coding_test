import sys

sys.setrecursionlimit(10**9)

def searchTree(start):
    visit[start] = False
    for i in node[start]:
        if visit[i]:
            answer[i] = start
            searchTree(i)


input = sys.stdin.readline

N = int(input())

node = [[] for _ in range(N+1)]
visit = [True] * (N+1)
answer = [[] for _ in range(N+1)]
for _ in range(N-1):
    a, b = map(int, input().split())
    node[a].append(b)
    node[b].append(a)

searchTree(1)

for i in range(2, N+1):
    print(answer[i])
