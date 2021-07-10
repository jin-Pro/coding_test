import sys


def dfs(energy, index, marble):
    if index >= len(marble)-1:
        return energy

    answer = []

    for i in range(1, len(marble)-1):
        tempMarble = []
        for j in range(len(marble)):
            if i == j:
                continue
            tempMarble.append(marble[j])

        answer.append(dfs(energy+marble[i-1]*marble[i+1], 1, tempMarble))

    return max(answer)


input = sys.stdin.readline

N = int(input())

circle = list(map(int, input().split(' ')))

answer = []

for i in range(1, N-1):
    answer.append(dfs(0, i, circle))

print(max(answer))
