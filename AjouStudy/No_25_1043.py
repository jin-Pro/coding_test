import sys
from collections import deque


def find(x):
    if x != parent[x]:
        parent[x] = find(parent[x])

    return parent[x]


def union(a, b):
    a = find(a)
    b = find(b)

    if a > b:
        parent[a] = b
    else:
        parent[b] = a


input = sys.stdin.readline

# N 사람의 수
# M 파티의 수
N, M = map(int, input().split())

# 총 파티의 수에서 거짓말 파티의 수를 뺄것임
answer = M

parent = [i for i in range(N+1)]

knowPerson = list(map(int, input().rstrip().split()))

party = [list(map(int, input().rstrip().split())) for _ in range(M)]

if knowPerson[0] == 0:
    print(answer)
else:
    for i in range(1, len(knowPerson)-1):
        union(knowPerson[i], knowPerson[i+1])

    for i in party:
        for j in range(1, len(i)-1):
            union(i[j], i[j+1])

    checkKnowPerson = knowPerson[1:]

    for i in range(len(checkKnowPerson)):
        checkKnowPerson[i] = find(checkKnowPerson[i])

    for i in party:
        for j in range(1, len(i)):
            if find(i[j]) in checkKnowPerson:
                answer -= 1
                break

    print(answer)